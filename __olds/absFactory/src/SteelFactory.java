class SteelFactory implements FurnitureFactory {
    public Chair createChair() { return new SteelChair(); }
    public Table createTable() { return new SteelTable(); }
}