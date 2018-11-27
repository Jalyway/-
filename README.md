# -Usecase Diagram：
	使用者有六項功能性需求(functional requirement)
	管理者有兩項功能性需求(functional requirement)

註記：
已把原先的其中一項功能性需求“等待時間預估及狀態告知”，整合至“外送服務”的functional requirement裡。

![image](https://github.com/Jalyway/-/blob/master/ReadMe/image1.png)

#---------------------------------------------------------------------------------------------------
點餐系統 總流程圖

![image](https://github.com/Jalyway/-/blob/master/ReadMe/image2.png)

這是我們設計的點餐系統如何運作的總流程圖，一開始進入系統的時候即為登入和註冊的頁面，註冊的話必須輸入的有五個項目，分別是帳號、密碼、姓名、電話和信箱；如果已經有帳號的話，輸入帳號和密碼就可以直接登入系統並看到主畫面，點擊點餐系統的圖標就可以開始選擇想要吃的餐廳和餐點的份數了，我們設計了六家餐廳可以選擇。我們另外有設計忘記密碼的部分，輸入註冊時所輸入的信箱和帳號，系統便會寄一封驗證信到使用者信箱，經過確認身份後使用者將可以輸入新密碼來修改原本的密碼。
我們在主畫面還有設計可以查看餐廳資訊以及可以讓使用者填寫意見的功能，由於我們是以連鎖店的形式構想的，當進入餐廳資訊的頁面便會以列表的形式顯示每一家餐廳的詳細資訊，以及標出在google地圖上的位置；若是想要填寫對於本系統的一些想法或指教的部分可以去問題回報頁面填寫，並可以給予我們滿意度評分，有滿意、普通、不滿意這三個等級。
當選完餐點的時候系統會跳到付款的畫面，使用者可以選擇要使用信用卡支付或是用現金支付，若是想要用信用卡支付的話則需要輸入信用卡卡號，最後會進入到讓使用者選擇是要到店內取餐、外送、或是內用的服務。
選擇外送的話便會要求使用者輸入需要送達的地址，並且會顯示是由哪一個地方的店家送出的以及店家的地址電話和預估等待的時間；若是想要到店取餐的客人則需要選擇想要在哪一間店取餐，系統便會通知那家店開始準備餐點，並且也會顯示預估可以去取餐的時間；選擇內用的話則會直接顯示明細表。
選擇完後會顯示出剛剛點的餐點的詳細明細，包含點了哪些餐點以及總共需要付多少金額，就完成點餐的整個程序了。

#-----------------------------------------------------------------------------------------------------.
使用者登錄：

在餐廳程式的首頁，使用者必須登錄帳號才能使用點餐服務，第一次使用要先註冊帳號，包含帳號、密碼、信箱及行動電話的輸入，然後透過信箱或電話簡訊來認證新帳號。會員登入的帳號資料會從User資料庫進行身分核對，若核對錯誤代表帳號資料有誤，必須重新登錄，假如使用者忘記密碼，可以點選忘記密碼的按鈕，在使用者輸入帳號與信箱並進行身分驗證後，即可創建新密碼。成功登錄後會進入主畫面，非第一次使用的客戶會根據使用者過去的點餐習慣，在頁面上顯示飲食偏好建議，也會載入目前營業中的餐廳，而主頁下方也會提供一個按鈕讓使用者隨時發表意見與回饋，提供我們業者改進的地方。

![image](https://github.com/Jalyway/-/blob/master/ReadMe/image3.png)
