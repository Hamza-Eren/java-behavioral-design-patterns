🌐 **Select Language / Dil Seçimi:**
* [🇹🇷 Türkçe İçerik](#java-davranışsal-tasarım-kalıpları)
* [🇺🇸 English Content](#java-behavioral-design-patterns)

## Java Davranışsal Tasarım Kalıpları

Bu depo, Udemy üzerinde tamamladığım **Design Patterns (Akın Kaldıroğlu)** eğitimi kapsamındaki tüm davranışsal kalıp ödevlerini, pratik iş senaryolarını ve kurumsal mimari çözümlerini içermektedir. Proje, temiz kod (Clean Code) prensiplerine ve nesne yönelimli programlama (OOP) standartlarına uygun olarak geliştirilmiştir.

---

### Teknolojik Altyapı
* **Programlama Dili:** Java 21
* **Bağımlılık ve Yapı Yönetimi:** Maven

---

### Uygulanan Tasarım Kalıpları ve İş Senaryoları

#### 🔹 Davranışsal Kalıplar (Behavioral Patterns)

#### 1. Strategy & Simple Factory Pattern (Sıralama Yönetimi)
* **İş Senaryosu:** Uygulamada farklı veri boyutlarına ve performans ihtiyaçlarına göre (`BubbleSort`, `JavaArraySort`, `ApacheSort`) sıralama stratejileri soyutlaştırılmıştır. Nesne üretim süreçleri `SorterFactory` ile kapsüllenmiş, `SortingContext` vasıtasıyla çalışma zamanında (runtime) algoritmalar arası geçiş sağlanmıştır.
* **Paket Konumu:** `src/main/java/tr/com/hamzaeren/designpatterns/behavioral/strategy`

#### 2. Command Pattern (Televizyon ve Kumanda İlişkisi)
* **İş Senaryosu:** Televizyon üzerindeki açma, kapatma, kanal değiştirme ve ses açma/kapama operasyonları bağımsız komut nesnelerine (`TurnOnCommand`, `ChangeChannelCommand` vb.) dönüştürülmüştür. Uzaktan kumanda bu sayede televizyonun iç metotlarından tamamen bağımsız hale getirilmiştir.
* **Paket Konumu:** `src/main/java/tr/com/hamzaeren/designpatterns/behavioral/command`

#### 3. Template Method Pattern (Çağrı Merkezi Veri Transferi)
* **İş Senaryosu:** 3 farklı çağrı merkezinden kurumsal sisteme veri transferi süreci modellenmiştir. İş akışındaki standart adımlar (`saveMetadata`, `verifyAudio`, `saveAudio`) soyut ata sınıfta sabitlenirken, çağrı merkezine göre değişen adımlar (`fetchMetadata`, `fetchAudioData`) alt somut sınıflara bırakılmıştır.
* **Paket Konumu:** `src/main/java/tr/com/hamzaeren/designpatterns/behavioral/templatemethod`

#### 4. Observer Pattern (Stok Takip ve Fiyat Alarm Sistemi)
* **İş Senaryosu:** Bir e-ticaret platformundaki ürünlerin fiyat veya stok durumu değişimleri simüle edilmiştir. Ürün (`Subject`) durumunda bir değişiklik meydana geldiği an, ürünü takibe alan müşteriler (`CustomerObserver`) ve tedarikçiler (`VendorObserver`) reaktif olarak anında bilgilendirilmektedir.
* **Paket Konumu:** `src/main/java/tr/com/hamzaeren/designpatterns/behavioral/observer`

#### 5. Mediator Pattern (Banka Şubesi Sıra Yönetimi)
* **İş Senaryosu:** Banka şubesine rastgele zamanlarda gelen müşteriler ile gişelerdeki çalışanların koordinasyonu sağlanmıştır. Müşteriler ve çalışanlar birbirleriyle doğrudan iletişim kurmak yerine, tüm kuyruk ve atama trafiğini merkezi bir sıramatik gibi çalışan `BranchMediator` üzerinden yürütmektedir.
* **Paket Konumu:** `src/main/java/tr/com/hamzaeren/designpatterns/behavioral/mediator`

#### 6. State Pattern (Klima AC Durum Yönetimi)
* **İş Senaryosu:** Bir klimanın çalışma durumları (`OffState`, `CoolingState`, `HeatingState`) modellenmiştir. Klima nesnesi, karmaşık `if-else` blokları kullanılmadan, o anki aktif durumuna göre butonlara basıldığında farklı davranışlar sergilemektedir (Örn: Kapalıyken mod butonunun uyarı vermesi).
* **Paket Konumu:** `src/main/java/tr/com/hamzaeren/designpatterns/behavioral/state`

---

#### 🔹 Yapısal Kalıplar (Structural Patterns)

##### 1. Flyweight Pattern (Oyun Karakteri Hafıza Optimizasyonu)
* **İş Senaryosu:** Grafik yoğunluklu oyunlardaki asker ve sivil karakterlerin üretimi simüle edilmiştir. Model ve kaplama (texture) gibi ağır veriler tek bir merkezde paylaşılıp hafıza optimizasyonu (RAM) sağlanırken, koordinat ve oyuncu adı gibi hafif veriler dışarıda bırakılmıştır.
* **Paket Konumu:** `src/main/java/tr/com/hamzaeren/designpatterns/structural/flyweight`

##### 2. Composite Pattern (Proje ve Görev Ağaç Mimarisi)
* **İş Senaryosu:** Kurumsal bir projenin alt parçaları (`Task`, `Issue`) ve alt projeleri hiyerarşik ağaç yapısında modellenmiştir. Composite yapısı sayesinde tekil bir görev ile içinde onlarca görev barındıran alt projeler polimorfik olarak aynı arayüz üzerinden yönetilmektedir.
* **Paket Konumu:** `src/main/java/tr/com/hamzaeren/designpatterns/structural/composite`

##### 3. Proxy Pattern (Lisans Kontrollü Erişim Denetimi)
* **İş Senaryosu:** Sınırlı lisans sayısına sahip kurumsal bir yazılıma erişim güvenliği kurgulanmıştır. `LicenseProxy` sınıfı, asıl uygulamaya erişen kullanıcı sayısını denetlemekte, limit aşımında kullanıcıları kuyruğa almakta ve yer açıldığında otomatik olarak uygulamaya dahil etmektedir.
* **Paket Konumu:** `src/main/java/tr/com/hamzaeren/designpatterns/structural/proxy`

##### 4. Decorator Pattern (Dinamik Kasko Poliçesi Hesaplama)
* **İş Senaryosu:** Sürücü yaşı, kaza geçmişi ve ekstra lüks araç donanımlarına göre dinamik olarak değişen bir araç kasko poliçesi mimarisi tasarlanmıştır. Temel kasko nesnesi, çalışma zamanında soğan kabuğu gibi dekoratörlerle sarılarak sınıf patlamasının önüne geçilmiştir.
* **Paket Konumu:** `src/main/java/tr/com/hamzaeren/designpatterns/structural/decorator`

##### 5. Bridge Pattern (ORM Çerçeve / Veri Tabanı Soyutlama)
* **İş Senaryosu:** JPA/EntityFramework benzeri veri tabanından bağımsız bir veri saklama çatısı modellenmiştir. Soyutlama katmanı (`Collection`, `Set`) ile gerçekleştirim katmanı (`SqlServerEngine`, `PostgreSQLEngine`) bir köprü vasıtasıyla birbirinden ayrılarak bağımsız büyümeleri sağlanmıştır.
* **Paket Konumu:** `src/main/java/tr/com/hamzaeren/designpatterns/structural/bridge`

---

### Projeyi Yerelde Çalıştırma ve Test Etme

1. Projeyi GitHub üzerinden bilgisayarınıza klonlayın:
   ```bash
   git clone https://github.com/Hamza-Eren/java-behavioral-design-patterns.git
   ```
2. Projeyi IDE'niz (IntelliJ, Eclipse vb.) ile açın. Maven bağımlılıklarının (`pom.xml`) yüklenmesini bekleyin.
3. Her tasarım kalıbı kendi paketi içinde bağımsız bir `Main.java` test sınıfına sahiptir. Test etmek istediğiniz kalıbın paketine giderek ilgili sınıfı çalıştırabilirsiniz:
    * **Strategy:** `tr.com.hamzaeren.designpatterns.behavioral.strategy.Main`
    * **Command:** `tr.com.hamzaeren.designpatterns.behavioral.command.Main`
    * **Template Method:** `tr.com.hamzaeren.designpatterns.behavioral.templatemethod.Main`
    * **Observer:** `tr.com.hamzaeren.designpatterns.behavioral.observer.Main`
    * **Mediator:** `tr.com.hamzaeren.designpatterns.behavioral.mediator.Main`
    * **State:** `tr.com.hamzaeren.designpatterns.behavioral.state.Main`

---
**Geliştirici:** [Hamza Eren](https://hamzaeren.com.tr)

---
---

## Java Behavioral Design Patterns

This repository contains all behavioral design pattern assignments, practical business scenarios, and enterprise architecture solutions completed as part of the **Design Patterns (Akın Kaldıroğlu)** course on Udemy. The project is developed in accordance with Clean Code principles and Object-Oriented Programming (OOP) standards.

### Technical Infrastructure
* **Programming Language:** Java 21
* **Dependency and Build Management:** Maven

### Implemented Design Patterns and Business Scenarios

#### 🔹 Behavioral Patterns

#### 1. Strategy & Simple Factory Pattern (Sorting Management)
* **Business Scenario:** Sorting strategies (`BubbleSort`, `JavaArraySort`, `ApacheSort`) are abstracted based on varying data sizes and performance requirements. Object creation workflows are encapsulated via `SorterFactory`, enabling dynamic, runtime algorithm switching through `SortingContext`.
* **Package Location:** `src/main/java/tr/com/hamzaeren/designpatterns/behavioral/strategy`

#### 2. Command Pattern (Television and Remote Control Relationship)
* **Business Scenario:** Power on/off, channel selection, and volume controls on a television are encapsulated into independent command objects (`TurnOnCommand`, `ChangeChannelCommand`, etc.). This decouples the remote control (`Invoker`) from the television's internal method implementations.
* **Package Location:** `src/main/java/tr/com/hamzaeren/designpatterns/behavioral/command`

#### 3. Template Method Pattern (Call Center Data Transfer)
* **Business Scenario:** The data transfer process from 3 different call centers to the enterprise system is modeled. Standard workflow steps (`saveMetadata`, `verifyAudio`, `saveAudio`) are locked within the abstract base class, while center-specific steps (`fetchMetadata`, `fetchAudioData`) are deferred to concrete subclasses.
* **Package Location:** `src/main/java/tr/com/hamzaeren/designpatterns/behavioral/templatemethod`

#### 4. Observer Pattern (Stock Tracking and Price Alarm System)
* **Business Scenario:** Price and stock availability modifications for products on an e-commerce platform are simulated. Whenever a product's (`Subject`) state changes, registered customers (`CustomerObserver`) and suppliers (`VendorObserver`) are reactively and instantly notified.
* **Package Location:** `src/main/java/tr/com/hamzaeren/designpatterns/behavioral/observer`

#### 5. Mediator Pattern (Bank Branch Queue Management)
* **Business Scenario:** Coordination between customers arriving at a bank branch at random intervals and employees at desks is established. Customers and employees do not maintain direct references to each other; instead, all queuing and routing traffic is coordinated via a central queue management system, `BranchMediator`.
* **Package Location:** `src/main/java/tr/com/hamzaeren/designpatterns/behavioral/mediator`

#### 6. State Pattern (Air Conditioner AC State Management)
* **Business Scenario:** Operating states of an air conditioner (`OffState`, `CoolingState`, `HeatingState`) are modeled. Without complex `if-else` or `switch-case` blocks, the AC object exhibits distinct behaviors upon button presses based on its active state (e.g., triggering a warning when the mode button is pressed while the unit is off).
* **Package Location:** `src/main/java/tr/com/hamzaeren/designpatterns/behavioral/state`

---

#### 🔹 Structural Patterns

##### 1. Flyweight Pattern (Game Character Memory Optimization)
* **Business Scenario:** Production of soldier and civilian characters in graphics-intensive games is simulated. Heavy data like models and textures are shared intrinsically to optimize RAM usage, while lightweight extrinsic state data like coordinates are passed externally.
* **Package Location:** `src/main/java/tr/com/hamzaeren/designpatterns/structural/flyweight`

##### 2. Composite Pattern (Project and Task Tree Architecture)
* **Business Scenario:** Sub-components (`Task`, `Issue`) and subprojects of an enterprise project are modeled in a hierarchical tree structure. Singular tasks and complex subprojects containing multiple actions are handled polymorphically via a unified interface.
* **Package Location:** `src/main/java/tr/com/hamzaeren/designpatterns/structural/composite`

##### 3. Proxy Pattern (License-Controlled Access Control)
* **Business Scenario:** An access security system is implemented for an enterprise software application with limited licenses. The `LicenseProxy` class monitors the count of concurrent users, directs excess demands into a waiting queue, and provisions application access automatically when slots open.
* **Package Location:** `src/main/java/tr/com/hamzaeren/designpatterns/structural/proxy`

##### 4. Decorator Pattern (Dynamic Car Insurance Premium Calculation)
* **Business Scenario:** A car insurance premium system that adapts dynamically to driver age, accident history, and premium car accessories is designed. The base insurance instance is wrapped at runtime like an onion skin with concrete decorators, avoiding subclass explosion.
* **Package Location:** `src/main/java/tr/com/hamzaeren/designpatterns/structural/decorator`

##### 5. Bridge Pattern (ORM Framework / Database Abstraction)
* **Business Scenario:** A database-agnostic data persistence framework similar to JPA/Hibernate is modeled. The abstraction layer (`Collection`, `Set`) and the implementation layer (`SqlServerEngine`, `PostgreSQLEngine`) are decoupled through a bridge interface to allow independent scaling.
* **Package Location:** `src/main/java/tr/com/hamzaeren/designpatterns/structural/bridge`

---

### Running and Testing the Project Locally

1. Clone the project repository to your local machine via GitHub:
   ```bash
   git clone https://github.com/Hamza-Eren/java-behavioral-design-patterns.git
   ```
2. Open the project in your IDE (IntelliJ, Eclipse, etc.) and wait for the Maven dependencies (`pom.xml`) to build.
3. Each design pattern features an independent `Main.java` test class inside its own package. Navigate to the specific package and execute the respective class to run the simulation:
    * **Strategy:** `tr.com.hamzaeren.designpatterns.behavioral.strategy.Main`
    * **Command:** `tr.com.hamzaeren.designpatterns.behavioral.command.Main`
    * **Template Method:** `tr.com.hamzaeren.designpatterns.behavioral.templatemethod.Main`
    * **Observer:** `tr.com.hamzaeren.designpatterns.behavioral.observer.Main`
    * **Mediator:** `tr.com.hamzaeren.designpatterns.behavioral.mediator.Main`
    * **State:** `tr.com.hamzaeren.designpatterns.behavioral.state.Main`

---
**Developer:** [Hamza Eren](https://hamzaeren.com.tr)

[🔼 Sayfa Başına Dön / Back to Top](#java-davranışsal-tasarım-kalıpları)