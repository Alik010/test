 1 способ:
  В нашем проекте в окошке слева, есть Scratches ana Consoles раскрываемб, далее правйо кнопкой по Scratches->New->HTTP Request.
  Далее add request->Post text body
  Редактируем запрос:
    POST меняем на PUT
    http://localhost:80/api/item меняем на http://localhost:8080/car-owner-info
    И добавляем наш json в фигурные скобки  "carId": 15,"carName": "Porsche","ownerName": "John","registrationCountry": "Usa"
    Запускаем TaskApplication.java
    В консоли получаем ответ.
2 способ:
    Открываем Postman и создаем там запрос, PUT метод,request url:http://localhost:8080/car-owner-info,выбираем в Headers key:content-type, value:application/json,далее в body выбираем raw и вставляем json:{"carId": 15,"carName": "Porsche","ownerName": "John","registrationCountry": "Usa"}.Получаем ответ.
