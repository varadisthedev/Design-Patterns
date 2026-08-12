class WoodenFactory implements FurnitureFactory {
    public Chair createChair() { return new WoodenChair(); }
    public Table createTable() { return new WoodenTable(); }
}