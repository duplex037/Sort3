public class StaticSortDisplayFactory 
    implements SortDisplayFactory {
  public SortDisplay makeSortDisplay(String name) {
    if ("horizontal".equals(name)) 
      return new HSortDisplay(); 
    else if ("vertical".equals(name)) 
      return new VSortDisplay(); 
    else if ("bottom".equals(name)) 
      return new BSortDisplay(); 
    else if ("bar".equals(name)) 
      return new BarSortDisplay();
    else if ("circle".equals(name)) 
        return new CircleDisplay();
    else if ("dot".equals(name)) 
        return new DotDisplay();
    else if ("string".equals(name)) 
        return new StringDisplay();
    else 
      return new HSortDisplay(); 
  }
}
