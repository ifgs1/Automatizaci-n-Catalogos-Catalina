//
//  CategoriesViewControllerTableViewController.h
//  Catalogo
//
//  Created by Ivan F Garcia S on 4/29/15.
//  Copyright (c) 2015 Ivan F Garcia S. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "Category.h"
@interface CategoriesViewControllerTableViewController : UITableViewController

@property (nonatomic, retain) NSMutableArray *listCategories;
@property (nonatomic, retain) NSString *titles;
@property (strong, nonatomic)   Category1 *myCategory;

@end
