# Maven Surefire Plugin Test Durations

This repo is solely for experimentation and investigation of the test durations
reported by the
[Maven Surefire Plugin](https://maven.apache.org/surefire/maven-surefire-plugin/).

## What I learned

I wrote the simplest test
[AppTest](./src/test/java/com/github/teleivo/AppTest.java) using
`Thread.sleep()` to clearly provoke timings in the report that can be
attributed back to the testcase or suite.

Surefire reports a `time` attribute for the
* test suite (class) which includes the time it takes to run `@BeforeClass`
  methods and the total of all test cases
* test case (method) which includes the time it takes to run `@Before` methods
  and the time it takes to run the test

See
[AppTest.xml](./target/surefire-reports/TEST-com.github.teleivo.AppTest.xml)

No surprises here 😋️

IntelliJ suprised me a bit since it did not include the `@BeforeClass` time in
the test duration. See [screenshot.png](./intellij_test_duration_report.png)

## Related

If you want to convert Surefire XML reports to CSV for further processing head
over to [maven-surefire-reports-to-csv](https://github.com/teleivo/maven-surefire-reports-to-csv).
