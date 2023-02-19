public class Kitchen extends Room {
        private Item[] items = new Item[]{new Item[]("Выдвижной ящик"),
                new Item[]("Верхний ящик под столешницей")};

        @Override
        public void printItems() {
                int i;
                for (i = 0; i < items.length; i++) {
                        System.out.println(items[i]);
                }
                String s2 = String.valueOf(items[i]);
                s2.printItems();
                System.out.println("Претметы в комнате " + room.name + ": " + items[i]);
        }
}
