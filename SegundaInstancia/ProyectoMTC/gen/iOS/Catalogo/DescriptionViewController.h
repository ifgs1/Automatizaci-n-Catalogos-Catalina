//
//  DescriptionViewController.h
//  Catalogo
//
//  Created by Ivan F Garcia S on 5/21/15.
//  Copyright (c) 2015 Ivan F Garcia S. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "Product.h"
@interface DescriptionViewController : UIViewController
@property (weak, nonatomic) IBOutlet UILabel *lblProductDescription;
- (IBAction)close:(id)sender;
@property (weak, nonatomic) IBOutlet UIImageView *imgProduct;
-(void)setProduct:(Product *)product;
@property (strong, nonatomic)   Product *myProduct;


@end
