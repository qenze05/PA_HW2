1) Створити багатомодульний Java/Kotlin Maven проєкт з щонайменше 3 модулів
(game, player_info, server_info)

2) Додати залежності одного модуля від двох інших. Використати залежності з Maven Central
(game залежить від player_info & server_info, також з Maven Central завантажено Gson)
 
3) Додати Maven Copy Resources плагін та скопіювати якийсь ресурс між модулями
(game/src/main/resources/game.json -> player_info/src/main/resources/game.json)
 
4) Створити та використати профіль Maven для зібрання проєкту
(prod і test профілі)
 
5) Створити та використати архетип
(архів окремо)
   
