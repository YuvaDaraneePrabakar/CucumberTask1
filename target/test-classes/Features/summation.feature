Feature: My Test Case

Scenario: Checking Summation Values
  Given My data is ready
  When My data is <r1>, <r2>, <r3>
  Then My data is "<valid>"

Examples:
  | r1 | r2 | r3 | valid |
  | 1  | 2  | 3  | valid |
  | 5  | 4  | 9  | valid |
  | 7  | 8  | 7  | invalid |
