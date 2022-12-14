Feature: Uploading files
  Scenario Outline: Upload a file
    Given user is on the upload file screen
    When user clicks on Browse button
    And user enters <filename> to upload texbox
    And user clicks on enter button
    Then verify that the file uploaded successfully

    Examples:
      | filename |
      | file1    |
      | file2    |