# Bird Watcher Tasks

## 1. Check Last Week's Counts

For comparison purposes, you always keep a copy of last week's counts nearby, which were: 0, 2, 5, 3, 7, 8, and 4. Implement the `BirdWatcher.getLastWeek()` method that returns last week's counts:

```java
BirdWatcher.getLastWeek();
// => [0, 2, 5, 3, 7, 8, 4]
```

## 2. Check Birds Visited Today

Implement the `BirdWatcher.getToday()` method to return how many birds visited your garden today. The bird counts are ordered by day, with the first element being the count of the oldest day, and the last element being today's count.

```java
int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getToday();
// => 1
```

## 3. Increment Today's Count

Implement the `BirdWatcher.incrementTodaysCount()` method to increment today's count:

```java
int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.incrementTodaysCount();
birdCount.getToday();
// => 2
```

## 4. Check if there was a Day with No Visiting Birds

Implement the `BirdWatcher.hasDayWithoutBirds()` method that returns true if there was a day at which zero birds visited the garden; otherwise, return false:

```java
int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.hasDayWithoutBirds();
// => true
```

## 5. Calculate the Number of Visiting Birds for the First Number of Days

Implement the `BirdWatcher.getCountForFirstDays()` method that returns the number of birds that have visited your garden from the start of the week, but limit the count to the specified number of days from the start of the week.

```java
int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getCountForFirstDays(4);
// => 14
```

## 6. Calculate the Number of Busy Days

Some days are busier than others. A busy day is one where five or more birds have visited your garden. Implement the `BirdWatcher.getBusyDays()` method to return the number of busy days:

```java
int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getBusyDays();
// => 2
```