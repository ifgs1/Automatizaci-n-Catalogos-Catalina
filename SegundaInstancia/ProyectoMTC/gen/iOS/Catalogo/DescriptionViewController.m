//
//  DescriptionViewController.m
//  Catalogo
//
//  Created by Ivan F Garcia S on 5/21/15.
//  Copyright (c) 2015 Ivan F Garcia S. All rights reserved.
//

#import "DescriptionViewController.h"

@interface DescriptionViewController ()

@end

@implementation DescriptionViewController

-(void)setProduct:(Product *)product{
    if (_myProduct != product) {
        _myProduct = product;
        
        [self configureView];
    }

}
- (void)configureView
{
    
    if (self.myProduct) {
        
    }
}

- (void)viewDidLoad {
    [super viewDidLoad];
    
    [self loadProductDescription];
    // Do any additional setup after loading the view.
}
-(void)loadProductDescription{
                self.lblProductDescription.text = [self.lblProductDescription.text stringByAppendingString:[NSString stringWithFormat:@"%@%@\n",@"nombre: ",self.myProduct.nombre]];
                self.lblProductDescription.text = [self.lblProductDescription.text stringByAppendingString:[NSString stringWithFormat:@"%@%@\n",@"precio: ",self.myProduct.precio]];
 			   NSURL * imageURL = [NSURL URLWithString:self.myProduct.imagen];
 			   NSData * imageData = [NSData dataWithContentsOfURL:imageURL];
   			   UIImage * image = [UIImage imageWithData:imageData];
   			   self.imgProduct.image = image;
                self.lblProductDescription.text = [self.lblProductDescription.text stringByAppendingString:[NSString stringWithFormat:@"%@%@\n",@"promocion: ",self.myProduct.promocion]];
}
- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

/*
#pragma mark - Navigation

// In a storyboard-based application, you will often want to do a little preparation before navigation
- (void)prepareForSegue:(UIStoryboardSegue *)segue sender:(id)sender {
    // Get the new view controller using [segue destinationViewController].
    // Pass the selected object to the new view controller.
}
*/

- (IBAction)close:(id)sender {
    [self dismissViewControllerAnimated:YES completion:nil];

}
@end
