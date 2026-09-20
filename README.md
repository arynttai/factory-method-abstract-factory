# Factory Method and Abstract Factory

This is my project for the Software Design Patterns course, Assignment 2. The theme is a hackathon made by Freedom (the company I work at). The hackathon has two tracks: Arbuz and Ticketon.

## What it does

**Part A — Factory Method** (package `hackathon.notification`)

Sends a welcome notification when a participant joins a track. `NotificationFactory` is the creator class. `ArbuzNotificationFactory` and `TicketonNotificationFactory` each create their own notification.

**Part B — Abstract Factory** (package `hackathon.track`)

Creates a task and a scoring rule together, for one track. `TrackFactory` is the abstract factory. `ArbuzTrackFactory` and `TicketonTrackFactory` each create a matching task and scoring for their own track.

`Main.java` is the client. It runs both parts and prints the results.

## How to run

Just run `Main.java`. It prints a notification and a track summary for Arbuz and for Ticketon.

## Clean Code

Here are 5 Clean Code rules I used, with examples from my own code.

**1. Good names**

```java
Task createTask();
Scoring createScoring();
```

The method names say exactly what they do. No comment needed.

**2. Small methods, one job each**

```java
public void send() {
    Notification notification = createNotification();
    System.out.println(notification.getMessage());
}
```

`send()` only creates a notification and prints it. Nothing else.

**3. Small classes, one job each**

`ArbuzTask` only describes the Arbuz task. `ArbuzScoring` only describes the Arbuz scoring rule. No class does two jobs at once.

**4. No magic numbers**

Before:

```java
public int getMaxScore() {
    return 50;
}
```

After:

```java
private static final int MAX_SCORE = 100;

public int getMaxScore() {
    return MAX_SCORE;
}
```

Now the number has a name and is defined in one place, not copy-pasted everywhere.

**5. Work with interfaces, not concrete classes**

```java
private static void printTrack(TrackFactory factory) {
    Task task = factory.createTask();
    Scoring scoring = factory.createScoring();
    ...
}
```

`printTrack` only knows about `TrackFactory`, `Task`, and `Scoring` (interfaces). It does not care if the real object is `ArbuzTrackFactory` or `TicketonTrackFactory`.
