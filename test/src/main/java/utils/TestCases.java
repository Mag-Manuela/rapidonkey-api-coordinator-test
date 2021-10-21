package utils;

public enum TestCases {
    T1("Testing login with empty field"),
    T2("Testing login with empty field"),
    T3("Testing login with invalid field"),
    T4("Testing login with invalid field"),
    T5("Testing changing account status"),
    T6("Testing successful login");

    private String testName;
    TestCases(String value){
        this.testName = value;
    }

    public String getTestName() {
        return testName;
    }
}
