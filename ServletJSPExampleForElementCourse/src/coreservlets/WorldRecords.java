package coreservlets;

public class WorldRecords {
  public static Object[][] recentRecords() {
    Object[][] records = {
      { "Event", "Name", "Time" },
      { "400 IM", "Michael Phelps", "4:03.84"},
      { "100 Br", "Lindsay Hall", "1:04.08"},
      { "200 IM", "Ariana Kukors", "2:06.15"}};
    return(records);
  }
}