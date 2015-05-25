//
//  ProductsTableViewController.h
//  Catalogo
//
//  Created by Ivan F Garcia S on 4/29/15.
//  Copyright (c) 2015 Ivan F Garcia S. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "Category.h"
#import "Product.h"
@interface ProductsTableViewController : UITableViewController<UISearchBarDelegate,UITextFieldDelegate, UITextViewDelegate>
@property (strong, nonatomic)   Category1 *myCategory;
-(void)setCategory:(Category1 *)category;
@property (nonatomic, retain) NSMutableArray *listProducts;
@property (strong, nonatomic)   Product *myProduct;
@property (strong,nonatomic) NSMutableArray *filteredProductList;
@property (weak, nonatomic) IBOutlet UISearchBar *searchBar;



@end
