# Coding Kata - Pattern Matching

An attempt at exploring techniques for working with pattern matching

## Information
This project uses:
- Scala 2.11.8
- SBT 0.13.8
- ScalaTest 2.2.6

##Instructions
We need to validate a user who is attempting to log into your system. Assume the username is a String.
- Following TDD, develop a mechanism for validating the username.
    - Return a welcome response if they are a recognised user.
    - Return an error response if they are an unknown user.
    
OPTIONAL - Make your code more robust by introducing a user model where the username and ID are supplied and validated.
## Compile instructions
```
sbt compile
```

## Test instructions
```
sbt test
```
