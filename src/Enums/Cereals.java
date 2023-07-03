package Enums;

public enum Cereals {
    CAPTAIN_CRUNCH(50, 2.99),
    FROOT_LOOPS(60, 3.99),
    REESES_PUFFS(100, 4.99),
    COCOA_PUFFS(75, 4.20);

    final int levelOfDeliciousness;
    final double price;
    Cereals(int levelOfDeliciousness,  double price){
        this.levelOfDeliciousness = levelOfDeliciousness;
        this.price = price;
    }
}
