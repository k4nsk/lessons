public class Kitchen extends Room {
        private Item[] items = new Item[]{new Item[]("Выдвижной ящик"),
                new Item[]("Верхний ящик под столешницей")};

        @Override
        public void printItems() {
                int i;
                for (i = 0; i < items.length; i++) {
                        System.out.println(items[i]);
                }
                printItems();
                System.out.println("Претметы в комнате " + name + ": " + items[i]);
        }
}
