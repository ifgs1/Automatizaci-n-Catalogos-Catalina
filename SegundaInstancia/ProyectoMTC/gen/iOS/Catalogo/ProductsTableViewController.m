//
//  ProductsTableViewController.m
//  Catalogo
//
//  Created by Ivan F Garcia S on 4/29/15.
//  Copyright (c) 2015 Ivan F Garcia S. All rights reserved.
//

#import "ProductsTableViewController.h"
#import "Category.h"
#import "AFNetworking.h"
#import "Product.h"
#import "DescriptionViewController.h"

@interface ProductsTableViewController ()

@end

@implementation ProductsTableViewController
@synthesize filteredProductList;

-(void)setCategory:(Category1 *)category
{
    if (_myCategory != category) {
        _myCategory = category;
        
        [self configureView];
    }
}
- (void)configureView
{
    
    if (self.myCategory) {
        
    }
}


- (void)viewDidLoad {
    [super viewDidLoad];
    
    [self.navigationItem setTitle:@"Productos"];

    [self loadProducts];
    


    self.tableView.tableHeaderView = self.searchBar;
    self.searchBar.delegate = self;


    UIButton *button = [UIButton buttonWithType:UIButtonTypeCustom];
    button.frame = CGRectMake(0, 0, 32, 32);
    [button setImage:[UIImage imageNamed:@"flechablanca@2x.png"] forState:UIControlStateNormal];
    [button addTarget:self action:@selector(back) forControlEvents:UIControlEventTouchUpInside];
    UIBarButtonItem *barButton=[[UIBarButtonItem alloc] init];
    [barButton setCustomView:button];
    self.navigationItem.leftBarButtonItem=barButton;
    

}
-(void)loadProducts{
    filteredProductList = [[NSMutableArray alloc]init];
    self.listProducts = [[NSMutableArray alloc]init];
    for (NSDictionary * pr in self.myCategory.products) {
        Product * product = [[Product alloc]init];
         product.nombre = [pr objectForKey:@"nombre"];
         product.precio = [pr objectForKey:@"precio"];
         product.imagen = [pr objectForKey:@"imagen"];
        [self.listProducts addObject:product];
        [filteredProductList addObject:product];

    }
    [self.tableView reloadData];
    
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
}

#pragma mark - Table view data source

#pragma mark - Table View
- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView
{
    return 1;
}
#pragma mark - TableView Datasource Methods
- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section
{
    return filteredProductList.count;
}
#pragma mark - TableView Delegate Methods
- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath
{
    UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:@"Cell"];
    if (cell==nil) {
        cell = [[UITableViewCell alloc] initWithStyle:UITableViewCellStyleSubtitle reuseIdentifier:@"Cell"];
        
    }
    cell.textLabel.textColor = [UIColor blackColor];
    cell.detailTextLabel.textColor = [UIColor blackColor];
    
    [cell setAccessoryType:UITableViewCellAccessoryDisclosureIndicator];
    [tableView setSeparatorInset:UIEdgeInsetsZero];
    if ([tableView respondsToSelector:@selector(setSeparatorInset:)]) {
        [tableView setSeparatorInset:UIEdgeInsetsZero];
    }
    Product * product = [[Product alloc]init];
    product = [filteredProductList objectAtIndex:indexPath.row];
              cell.textLabel.text =product.nombre;
             
             
 			   NSURL * imageURL = [NSURL URLWithString:product.imagen];
 			   NSData * imageData = [NSData dataWithContentsOfURL:imageURL];
   			   UIImage * image = [UIImage imageWithData:imageData];
  			   cell.imageView.image = image;

             
    


    return cell;
}


- (BOOL)tableView:(UITableView *)tableView canEditRowAtIndexPath:(NSIndexPath *)indexPath
{
    return YES;
    
}
- (CGFloat)tableView:(UITableView *)tableView heightForRowAtIndexPath:(NSIndexPath *)indexPath
{
    return 70;
}


-(void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath{
    self.myProduct= [self.listProducts objectAtIndex:indexPath.row];
    
    [self performSegueWithIdentifier:@"description" sender:self.myProduct];
}

- (void)tableView:(UITableView *)tableView willDisplayCell:(UITableViewCell *)cell forRowAtIndexPath:(NSIndexPath *)indexPath {
    cell.backgroundColor = [UIColor clearColor];
    cell.backgroundView.backgroundColor = [UIColor clearColor];
}

-(void)back{
    
    [self dismissViewControllerAnimated:YES completion:nil];
    
}
void UIImageFromURL2(NSURL * URL, void (^imageBlock)(UIImage * image), void (^errorBlock)(void) )
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
-(void)prepareForSegue:(UIStoryboardSegue *)segue sender:(id)sender{
    if([segue.identifier isEqualToString:@"description"])
    {
        DescriptionViewController *bookingInfo = segue.destinationViewController;
        UINavigationController *navController = (UINavigationController*)[segue destinationViewController];
        DescriptionViewController *controller = segue.destinationViewController;
        
        [controller setProduct:sender];
        
        
    }
}

- (void)searchBar:(UISearchBar *)searchBar textDidChange:(NSString *)searchText{
    [filteredProductList removeAllObjects];
    NSString * curString;
    Product *product = [[Product alloc]init];
    for (int i=0; i<self.listProducts.count; i++) {
        product= self.listProducts[i];
                  curString = product.nombre;
        if ([curString rangeOfString:searchText  options:NSCaseInsensitiveSearch].location == NSNotFound ) {
            
        }else{
            [filteredProductList addObject:product];
        }
    }
    
    if (searchBar.text.length ==0) {
        filteredProductList = [[NSMutableArray alloc]initWithArray:self.listProducts];
    }
    
    [self.tableView reloadData];
}
- (void)searchBarSearchButtonClicked:(UISearchBar *)searchBar
{
    [self.searchBar resignFirstResponder];
    // You can write search code Here
}
@end
