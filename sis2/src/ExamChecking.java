class ExamChecking {
    public static final int ITERATIONS = ;
    public static final int SHEETS_PER_ASSISTANT = ;
    private static final int TOTAL_SHEETS = 500;   // Общее количество экзаменационных листов
    private static final int SHEETS_PER_ASSISTANT = 50;   // Количество листов, которые проверяет каждый помощник
    private static final int ITERATIONS = 6;   // Количество итераций, которое выполняет каждый помощник

    public static void main(String[] args) {
        // Количество помощников (потоков) — это количество листов, поделённое на количество листов, которые проверяет каждый помощник
        int numberOfAssistants = TOTAL_SHEETS / SHEETS_PER_ASSISTANT;

        // Создаём и запускаем потоки (помощников)
        for (int i = 0; i < numberOfAssistants; i++) {
            Thread assistantThread = new CheckingThread(i + 1); // Каждому потоку даём уникальный идентификатор
            assistantThread.start();  // Запускаем поток
        }
    }
}

