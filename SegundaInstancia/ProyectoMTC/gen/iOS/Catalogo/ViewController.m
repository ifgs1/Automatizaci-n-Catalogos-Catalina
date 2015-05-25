//
//  ViewController.m
//  Catalogo
//
//  Created by Ivan F Garcia S on 4/29/15.
//  Copyright (c) 2015 Ivan F Garcia S. All rights reserved.
//

#import "ViewController.h"
#import "AFNetworking.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    [self.navigationItem setTitle:@"Acerca de"];
    [self loadProvider];
}
-(void)loadProvider{

    
    NSURL *baseURL = [NSURL URLWithString:@"http://uniandes-msls.rhcloud.com/catalogo-service/rest/services/"];
    NSString *path = @"empresa";
    
    
    AFHTTPSessionManager *manager = [[AFHTTPSessionManager alloc] initWithBaseURL:baseURL];
    manager.requestSerializer = [AFJSONRequestSerializer serializer];
    manager.responseSerializer = [AFJSONResponseSerializer serializer];
    

    
    [manager GET:path parameters:nil success:^(NSURLSessionDataTask *task, id responseObject) {
        
        for (NSDictionary * response in responseObject) {
            self.lblAddress.text = [response objectForKey:@"direccion"];
            self.lblEmail.text = [response objectForKey:@"email"];
            self.lblName.text = [response objectForKey:@"nombre"];
            self.lblPhone.text = [response objectForKey:@"telefono"];
            self.lblDesctiption.text = [response objectForKey:@"descripcion"];
            UIImageFromURL( [NSURL URLWithString:[response objectForKey:@"urlImagen"]], ^( UIImage * image )
                           {
                               self.imgProvider.image = image;
                           }, ^(void){

                           });
            
        }
        
    } failure:^(NSURLSessionDataTask *task, NSError *error) {
        
        UIAlertView *alertView = [[UIAlertView alloc] initWithTitle:@"Error while sending POST"
                                                            message:@"Sorry, try again."
                                                           delegate:nil
                                                  cancelButtonTitle:@"Ok"
                                                  otherButtonTitles:nil];
        [alertView show];
        
    }];


}
- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
}
void UIImageFromURL(NSURL * URL, void (^imageBlock)(UIImage * image), void (^errorBlock)(void) )
{
    dispatch_async(dispatch_get_global_queue(DISPATCH_QUEUE_PRIORITY_DEFAULT, 0 ), ^(void)
                   {
                       NSData * data = [[NSData alloc] initWithContentsOfURL:URL];
                       UIImage * image = [[UIImage alloc] initWithData:data];
                       dispatch_async( dispatch_get_main_queue(), ^(void){
                           if( image != nil )
                           {
                               imageBlock( image );
                           }
                           else
                           {
                               errorBlock();
                           }
                       });
                   });
}

@end
