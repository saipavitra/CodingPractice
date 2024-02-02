#Author: your.email@your.domain.com
Feature: Verify LoadId is being dispalyed in the Load-Board Page
  

  @RegressionTest 
  Scenario Outline: Verify load number in load details page
    Given RunnerClass "<User>"
    
    Examples:
    |User|
    |SaiPavitra|
    |Yugesh|
    
    