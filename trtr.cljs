(ns language.trtr)

;When you see "»" charachter in the source ignore text after "»"
;the character "»" indicates the context of the text.
;so "Balance»customer" means just "Balance" 
;
;Anorher important character is semicolumn ";"
;When you see semicolumn everything after it will
;be invisible to the software.
;semicolumns are just for comments.
;Nothing needs to be translated after a semicolumn.

(def lines
  {;30 Apr 2021
   "Sales Report" "Satış Raporu"
   
   ;29 Apr 2021
   "Currency" "Para Birimi"
   "Unknown Number" "Bilinmeyen Numara"
   ;settings
   "General Settings" "Temel Ayarlar"
   "Brand Name" "Görünen Ad (Tabela Adı / Marka)"
   "Your company / brand name" "Firmanızın görünen adı Ltd. Şti. gibi ekler olmadan. Mesela: 'SpillSu Bostancı'"
   "Company invoice name" "Firma Fatura Adı"
   "Tax Authority" "Vergi Dairesi"
   "Tax Number" "Vergi Numarası"
   "Invoice Address" "Fatura Adresi"
   "E-mail" "E-Posta"
   "City" "İl"
   "Town" "İlçe"
   "Company Location" "İşletme Konumu"
   "Phones" "Telefonlar"
   "Order Status" "Sipariş Alım Durumu"
   "Open" "Açık"
   "Customer Phones" "Müşteri Numaraları"
   "Hidden" "Gizli"
   "Visible" "Gizli Değil"
   "Sendind SMS" "SMS Gönderimi"
   "IVR Type" "Santral Tipi"
   "Not available" "Santral Yok"
   "Repeating order" "Standart Sipariş"
   "Product amount" "Adet Tuşlamalı"
   "Language" "Dil (Language)"
   "Other Settings" "Ek Ayarlar"
   "User Accounts" "Kullanıcı Hesapları"
   "Delivery Zones" "Dağıtım Bölgeleri"
   "Brand Settings" "Marka Ayarları"
   "API Settings" "API Ayarları"
   "Telsam Settings" "Telsam Ayarları"
   "SMS Contents" "SMS İçerikleri"
   ;settings.cljs/delivery areas
   "Zone Name" "Bölge Adı"
   "All Subscribers" "Tüm Aboneler"
   "Red Zone" "Kırmızı Bölge"
   "Blue Zone" "Mavi Bölge"
   "Yellow Zone" "Sarı Bölge"
   "Zone" "Bölge"
   "Add" "Ekle"
   ;"Delete" "Sil"
   "All accounts without assigned delivery area will be automatically assigned to the first one." "Bölge seçimi yapılmamış tüm aboneler en üstteki bölgeye atanır. Tüm siparişleri aynı plasiyere atamak için en üstteki bölgeye plasiyer atayın."

   ;Right Column
   "Workload" "İş yoğunluğu"
   "Today's orders" "Bu gün satılan ürünler"
   "Scheduled" "Bekleyen Sipariş"
   "Overdue" "Geciken Teslim"
   "Completed" "Teslim Edilen"
   "User: " "Kullanıcı: "

   ;Navbar
   ;"User: " "Kullanıcı: "
   "Restart the app" "Uygulamayı Yenile"
   "Secure log-out" "Güvenli Çıkış"
   "Operation" "Operasyon"
   "New Account" "Yeni Abone"
   "Account" "Abone"
   "Accounts" "Aboneler"
   "All Accounts" "Tüm aboneler"
   "Inventory" "Depo"
   "Storages" "Depolar"
   "Products" "Ürünler"
   "Carriers" "Personel"
   "Invoice" "Fatura"
   "Accountancy" "Muhasebe"
   "Make a payment" "Ödeme Yap"
   "Get a payment" "Ödeme Al"
   "Reports" "Raporlar"

   ;smartbox
   "Search" "Hızlı Ara"
   "New Order" "Yeni Sipariş"

   ;order
   "Unassigned" "Belirlenmedi"
   "Debit" "Borcu"
   "Credit" "Alacağı"
   "Filters" "Filtreler"
   "My orders" "Bana ait siparişler"
   "Unassigned orders" "Havuzdaki siparişler"
   "Hide delivered" "Teslim edilenleri gizle"
   "Show delviered" "Teslim edilenleri de göster"
   "Details" "Detaylar"
   ;"Products" "Ürünler"
   "Carrier" "Plasiyer"
   ;...
   ;"Account" "Abone"
   "Schedule order" "Teslim planı"
   "Now" "Şimdi"
   "Order note" "Sipariş notu"
   "Addition/Discount" "Ek ücret/İndirim"
   "Total: " "Toplam: "
   "Save" "Kaydet"
   "Close" "Kapat"

   ;employee status
   "delivering" "Dağıtımda"
   "on-duty" "Görevde"
   "break" "Molada"
   "offline" "Kapalı"

   ;Accounts
   "Please provide a name" "İsim girilmelidir"
   "Wrong location format" "Konum formatı hatalı"
   "Please provide a phone number" "Telefon numarası gereklidir."
   "Phone number must be 10 digits" "Telefon numaraları 10 haneli olmalıdır"
   "Account Name" "Cari Adı"
   "Tax ID" "Vergi Numarası"
   ;"Tax Authority" "Vergi Dairesi"
   ;"Invoice Address" "Fatura Adresi"
   "Account ID" "Cari Kodu"
   "It will be assigned automatically" "Otomatik Atanır"
   "IMPORTANT: Please don't use this area without consulting us." "UYARI: Sadece eski aboneleri kaydetmek için kullanılır. Bu alanı kullanmadan önce mutlaka bize danışın 0850 550 50 70"
   "If you leave empty a number will be assigned"  "Boş bırakırsanız otomatik olarak bir sayı atanır."
   "Name & Surname or Business Name" "İsim Soyisim veya Ünvan"
   "Note (Displays next to the name)" "Not (İsim yanında görünür)"
   "Receipt or Invoice" "Fiş/Fatura"
   "Receipt" "Fiş"
   ;"Invoice" "Fatura"
   "IVR Orders" "Telefonla Sipariş"
   "If this is closed, the user cannot place order via IVR." "Eğer bu alan kapalı olursa abone telesekreter yerine direk operatöre bağlanır."
   ;"Open" "Açık"
   "Closed" "Kapalı"
   "Delivery Area" "Dağıtım Bölgesi"
   "Neighbourhood" "Mahalle"
   "Street Name" "Cadde/Sokak"
   "Building" "Site/Bina/Daire"
   "Address Details" "Adres tarifi/notu"
   "Sales Promotions" "Satış Promosyonları"
   "Apply" "Uygula"
   "Don't Apply" "Uygulama"
   "Special Discounts" "Özel İndirimler"
   "Delivery Location" "Teslimat Konumu"
   ;"Phones" "Telefonlar"
   "Lent Equipment" "Emanetler"
   "Notes" "Ek Notlar"
   "Archived" "Arşive Kaldırılmış"
   "Yes" "Evet"
   "No" "Hayır"
   "Invoice Information" "Fatura Bilgileri"
   "Bank Account" "IBAN"
   "The record has been archived!" "Abone arşive kaldırıldı!"
   "Successfully saved!" "Başarıyla kaydedildi!"
   "Save another record" "Başka Abone Kaydet"
   ;"Save" "Kaydet"
   ;"New Account" "Yeni Hesap"
   ;"Account:" "Hesap"

   ; ---customertable.cljs
   "Paid back to the customer" "Müşterinin alacağı ödendi"
   "Customer paid towards debt" "Müşteri borç ödedi"
   "Debtors" "Borçlular"
   "Creditors" "Alacaklılar"
   ;"Lent Equipment" "Emanet Alanlar"
   "Active Accounts" "Aktif Aboneler"
   "Archived Accounts" "Arşivlenenler"
   ;"Account" "Abone"
   "Latest Order" "Son Sipariş"
   "Address" "Adres"
   ;"Notes" "Notlar"
   "Export" "Dışarı Aktar"

  ;Employee.cljs
   "Plase enter a name" "İsim girilmelidir"
   "Minimum 3 characters" "En az 3 haneli olmalı"
   "Carrier Name & Surname" "Çalışan Adı Soyadı"
   "Phone" "Telefon"
   "Color" "Renk"
   "Status" "Durum"
   "Assigned to Storage" "Satış Yaptığı Depo"
   "New Carrier" "Yeni Çalışan"
   "Carrier:"  "Çalışan:"
   "Quick ledger record" "Hızlı ödeme kaydı"

   ;Inventory.cljs
   "Item Name" "Ürün Adı"
   ;"Details" "Detaylar"
   "Item Code" "Stok Kodu"
   "Auto-assignment" "Otomatik Atanır"
   "If you leave it empty a number will be assigned" "Boş bırakırsanız otomatik bir sayı atanır"
   ;"Color" "Renk"
   "Track Returnables" "Boş Ürün Takibi"
   "If you want to track returnables choose 'Yes'. Once it's chosen it can't be changed later!" "Eğer boşlar takip edilecekse evet'i seçin ürün oluşturduktan sonra bu alan değiştilemez."
   "Sellable Item" "Müşteriye Satılır"
   "Nonsellable items can be tracked. Customers can't see them." "Satmadığınız ürün: başka bir firmanın boş ürünü veya sarf malzemesi olabilir. Müşteriye satmadığınız ürünler satış ekranında  gizlenir."
   "Price with VAT" "KDV Dahil Satış Fiyatı"
   "VAT" "KDV"
   "Price without VAT" "KDV'siz Fiyatı"
   "Returnable" "Depozitolu"
   "New Item" "Yeni Ürün"
   "Item" "Ürün"

   ;Search 
   "Order History" "Sipariş Geçmişi"
   ;"Make a payment" "Ödeme yap"
   ;"Get a payment" "Ödeme al"
   "Edit" "Düzenle"
   ;Order history


   ;Order pop-up
   "Balance»customer" "Müşteri Bakiyesi"
   "Scheduled Delivery" "Planlanan Teslim"
   "Notes»order" "Sipariş Notu"
   ;"Products" "Ürünler"
   "Service Fee" "Servis Ücreti"
   "Discount" "İndirim"
   "Order ID" "Sipariş no"
   ;"Carrier" "Plasiyer"
   ;"Unassigned" "Belirlenmedi"
   "This order is assigned to someone else." "İşlem yapmak için siparişi üstlenin."

   "I have delivered the items" "Ürünleri telim ettim"
   "I have collected containers" "Ürünleri teslim ettim"
   "I have collected the payment" "Ödemeyi aldım"
   "Not enough products in the storage" "Depoda ürün eksin"
   "Payer" "Ödemeyi yapan"
   "Payee" "Ödemeyi alan"

   ;Next two lines will be recorded to storage history 
   "Order delivery" "Sipariş teslimi"
   "Collected containers" "Alınan boşlar"

   "Payment Amount" "Ödeme Tutarı"
   "Items have been delivered" "Ürünler teslim edildi"
   "Containers have been collected"    "Boşlar teslim alındı"
   "Payment has been collected" "Ödeme alındı"

   "Cash Account" "Kasa"

   "Changed»order" "Değiştirildi"
   "Completed orders cannot be changed." "Teslim edilen siparişler değiştirilemez."
   "Save Changes" "Değişiklikleri Kaydet"

   "Total" "Toplam"
   "Total Price" "Toplam Ücret"

   ;phone & mixed.cljs
   "Call via IVR" "Santralden Ara"
   "Call" "Ara"
   "Calling..." "Aranıyor..."
   "Delete Record" "Kaydı Sil"
   "Delete" "Sil"
   "Cancel Deletion" "İptal"
   "Wrong format" "Yanlış format" ;;Update this line: "Ürünler hatalı girildi"

   ;Warehouse.cljs
   ;"Plase enter a name" "İsim girilmelidir"
   ;"Color" "Renk"
   ;"Notes" "Notlar"
   ;"Save" "Kaydet"
   ;"Notes" "Notlar"
   ;"Target Storage" "Hedef Depo"
   ;"Notes" "Notlar"
   ;"Save" "Kaydet"
   "Storage Name" "Depo Adı"
   "Storage Type" "Depo Tipi"
   "Vehicle" "Araç"
   "Warehouse" "Depo"
   "Storage Manager" "Depo Sorumlusu"
   "Source Storage" "Kaynak Depo"
   "Target Storage" "Hedef Depo"
   "Source" "Kaynak"
   "Target" "Hedef"
   "Items" "Ürünler"
   "Add New Storage" "Yeni Depo Ekle"
   "Add Items" "Ürün Girişi"
   "Move Items" "Depolar Arası"
   "Remove Items" "Ürün Çıkışı"
   "Move items to another storage" "Depolar arası transfer"
   "Storage" "Depo"
   "Move" "Taşı"

   ;Ledger.cljs
   ;"Source" "Kaynak"
   ;"Target" "Hedef"
   ;"Save" "Kaydet"
   "Saved" "Kaydedildi"
   "This area is mandatory" "Boş bırakılamaz"
   "Please select" "Lütfen seçim yapın"
   "Enter the value" "Lütfen değer girin"
   "Add a transaction" "Hızlı muhasebe kaydı"
   "Transaction reference" "İşlem Açıklaması"
   "Transaction date" "İşlem tarihi"
   ;"Now" "Şimdi"
   "Value" "Değer"
   "Date" "Tarih"
   ;"Account" "Hesap"
   "Start date" "Başlangıç"
   "End date" "Bitiş"
   ;"Apply" "Uygula"
   "Transaction" "İşlem"
   "Transaction Filter" "Kayıt Süzgeci"
   "Past 5 weeks" "Son 5 hafta tüm kayıtlar"
   "Filtered transactions" "Filtreli sonuçlar"
   "New Transaction" "Yeni Kayıt"


   ;users.cljs
   ;"Carrier" "Plasiyer"
   "Username" "Kullanıcı Adı"
   "Password" "Şifre"
   "Manager" "Yönetici"
   "Name" "Ad"
   "User" "Kullanıcı"
   "Permissions" "Yetkiler"
   "Add a new account" "Yeni Hesap Ekle"

   ;Time.cljs
   "January" "Ocak"
   "February" "Şubat"
   "March" "Mart"
   "April" "Nisan"
   "May " "Mayıs"
   "June" "Haziran"
   "July" "Temmuz"
   "August" "Ağustos"
   "September" "Eylül"
   "October" "Ekim"
   "November" "Kasım"
   "December" "Aralık"

   "Jan" "Oca"
   "Feb" "Şub"
   "Mar" "Mar"
   "Apr" "Nis"
   "May" "May"
   "Jun" "Haz"
   "Jul" "Tem"
   "Agu" "Ağu"
   "Sep" "Eyl"
   "Oct" "Eki"
   "Nov" "Kas"
   "Dec" "Ara"

   "Monday" "Pazartesi"
   "Tuesday" "Salı"
   "Wednesday" "Çarşamba"
   "Thursday" "Perşembe"
   "Friday" "Cuma"
   "Saturday" "Cumartesi"
   "Sunday" "Pazar"

   "minutes" "dakika"
   "hours" "saat"
   "days" "gün"
   "months" "ay"
   "ago" "önce"
   "later" "sonra"})

; END OF THE FILE
; Ignore everthing after this point

(def blocks
  {:settings-top
   [:<>
    [:h4 "Önemli Not:"]
    [:p "Türkçe içerik" [:strong " datanız kaybolur."] " Dropbox ile bağlanın"]
    [:p "Şunu kullanıyoruz " [:a {:href "https://remotestorage.io/"} "remotestorage.io"] " protokolle bağlanın."]]})