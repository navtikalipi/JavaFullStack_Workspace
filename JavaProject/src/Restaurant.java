class Restaurant {

    // HAS-A relationship
    private Chef chef;
    private Waiter waiter;

    Restaurant() {
        chef = new Chef();
        waiter = new Waiter();
    }

    void processOrder(String dishName) {
        waiter.takeOrder(dishName);
        chef.prepareDish(dishName);
        waiter.serveDish(dishName);
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.processOrder("Pasta");
    }
}
