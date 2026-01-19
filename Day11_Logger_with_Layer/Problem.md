🔹 STEP 2: Download:
log4j-1.2.17.jar

🔹 STEP 2: Eclipse add 

Project par Right Click

Build Path

Configure Build Path

Libraries

Add External JAR

log4j-1.2.17.jar

Apply & OK


# Logger in Core Java (Log4j)

## Problem
In Core Java applications, using `System.out.println()` for debugging and error tracking is not a good practice.  
It does not provide log levels, file storage, timestamps, or proper error management.  
This makes it difficult to track issues in real-world applications.

---

## Solution
To solve this problem, we use **Log4j Logger** in Core Java.

Log4j provides:
- Different log levels (DEBUG, INFO, WARN, ERROR, FATAL)
- File-based logging
- Console logging
- Better error tracking with time and class details

---

## Logger Levels
- **DEBUG** – Used for debugging information  
- **INFO** – General application information  
- **WARN** – Warning messages  
- **ERROR** – Runtime errors and exceptions  
- **FATAL** – Critical system failure  

---

src/log4jOutput.log



## Example Code
```java
import org.apache.log4j.Logger;

public class TestLog {
    static Logger log = Logger.getLogger(TestLog.class);

    public static void main(String[] args) {
     
    }
}


#### log4j.properties

# Define the root logger with file appender
log4j.rootLogger=DEBUG, FILE

# Define the file appender
log4j.appender.FILE=org.apache.log4j.FileAppender

# Log file location
log4j.appender.FILE.File=src/log4jOutput.log
# Alternative paths (use only one)
# log4j.appender.FILE.File=D:/log4jOutput.log

# Define the layout for file appender
log4j.appender.FILE.layout=org.apache.log4j.PatternLayout
log4j.appender.FILE.layout.ConversionPattern=%d{yyyy-MM-dd HH:mm:ss} [%t] %-5p %c - %m%n
