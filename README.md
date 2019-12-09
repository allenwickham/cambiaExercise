# Cambia Exercise Answers
## Tool questions
- > In your opinion, what’s helpful about version control systems?
  - Version control systems (VCSs) allow groups of people to work on a known set of software, while maintaining the changes made by previous groups.  Often, VCSs allow multiple groups to work on the same known set of software without allowing the groups to be affected by the other, while providing tools to merge the respective groups' changes.
- > What’s annoying about them?
  - VCSs often are very different from one another, so learning a new VCS can be difficult, and perhaps confusing for awhile. Sometimes VCSs will make simple things hard to do (CVS - finding all the files associated with a single checkin), or are bandwidth intensive/slow (Clear Case). VCSs can also provide a wide variety of ways to accomplish everything, which can lead to many different tools/methodologies for doing a single task (Git, Git Flow, etc.)
- > What are some pros and cons of using Docker to develop, test, and deploy software?
  - Since I've never used Docker, I don't have a ready opinion. However, anything that allows a software developer to produce quality software in a repeatable, testable fashion is a prime candidate for use in software development.
- > How do you choose which language to use for a given task?
  - Typically, I start from what I know, and Java is the tool I make use of the vast majority of the time. It is a mature language with many third-party libaries that extend its range, the virtual machine allows it to run on a large number of hard/soft platforms, and the many testing frameworks help to produce a maintainable solution. However, sometimes other languages will enable me to accomplish something much faster (Python, Javascript, etc.), and still provide a good portion of the features Java offers, so I'll occasionally pick other languanges.
- > How did you choose the language for the programming exercise above?
  - I'm used to doing this sort of string manipulation in Java, typically via POI for Microsoft-specific documents, but since this is just a text file, I chose Java.

## Testing Methodology questions
- > When is it appropriate to use automated testing?
  - For me, it is always appropriate to use automated testing. It allows people to develop a known set of tests that can be run whenever the need arises, which can alert people to when their changes have adversely affected the test(s). The tests, when well written, can provide team(s) the certainty that when changes are introduced, that the passing of the tests indicate that no adverse impact has occured.
- > When is it appropriate to use manual testing? 
  - Manual testing can be used for spot checking areas of the system that are hard to test/aren't suitable for automated testing, to provide testing while automated tests are being written, or when a scenario(s) is being replicated to expose issues in the current system(s). If at all possible, manual tests should be integrated into existing automated testing.
- > What factors do you think about as you decide where to focus testing efforts? 
  - I look at code coverage, code/system complexity, module/API/system interactions. Essentially, I'm looking to put the widest blanket of test coverage across a system with enough depth that critical areas of the system are tested. I'm also looking for opportunities to refactor code/systems if they're difficult to test.
- > How do you decide what not to test.
  - I've never seen a reason not to test. Perhaps a whole system cannot be tested, since that could have implications for other systems/customers, but at least the separate components can be tested. And honestly, the whole system should be able to be tested, perhaps in a system that represents the intended target environment that at the same time prevents critical changes from "leaking" out.
