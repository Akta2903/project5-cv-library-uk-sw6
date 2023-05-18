Feature: HomepageTest

  As a user I want to verify job search feauture

  @smoke @regression
 Scenario Outline: Verify job search result using different data set
   Given  I am on homepage
   When I enter jobtitle "<jobTitle>"
   And  I enter location "<location>"
   And I enter distance "<distance>"
   And I click on more search option
   And I enter minimum "<salaryMin>"
   And I enter maximum salary "<salaryMax>"
   And I select salaryType "<salaryType>"
   And I select jobType "<jobType>"
   And click on find job button
   Then I verify the result "<result>"

   Examples:
   |jobTitle         |location                 |distance|salaryMin|salaryMax|salaryType|jobType  |result                                           |
   |Tester           |Harrow, Greater London   |5 miles |30000    |50000    |Per annum |Permanent|Permanent Tester jobs in Harrow                  |
   |Automation Tester|Central London           |2 miles |40000    |60000    |Per annum |Contract |Contract Automation Tester jobs in Central London|
   |Developer        |Colindale, Greater London|1 mile  |3500     |4000     |Per month |Temporary|Temporary Developer jobs in Colindale            |
   |Developer        |Wembley, Greater London  |7 miles |20000    |40000    |Per annum |Part Time|Part Time Developer jobs in Wembley              |
   |nurse            |Birmingham               |1 mile  |20000    |40000    |Per annum |Contract |Contract Nurse jobs in Birmingham                |
   |QA               |Edgware                  |2 miles |30000    |50000    |Per month |Part Time|Part Time Qa jobs in Edgware                     |
