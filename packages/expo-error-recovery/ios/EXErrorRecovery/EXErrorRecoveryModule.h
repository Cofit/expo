//  Copyright © 2018 650 Industries. All rights reserved.

#import <UMCore/UMExportedModule.h>
#import <UMCore/UMModuleRegistryConsumer.h>

@interface EXErrorRecoveryModule : UMExportedModule

- (BOOL)pushProps:(NSString *)props;

- (NSString *)popProps;

@end
