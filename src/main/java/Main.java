public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();

    long amount = 1000_60;
    boolean registered = true;

    long bonus = service.calculate(1000_60, true);
    System.out.println(bonus);

  }
}

