package com.example.myappspk.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class Company {

    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("EmailГрнДатаObject")
    @Expose
    EmailГрнДата EmailГрнДатаObject;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("update")
    @Expose
    private String update;
    @SerializedName("version")
    @Expose
    private float version;
    @SerializedName("датаВып")
    @Expose
    private String датаВып;
    @SerializedName("датаОгрн")
    @Expose
    private String датаОгрн;
    @SerializedName("допВидДеятельности")
    @Expose
    ArrayList< Object > допВидДеятельности = new ArrayList < Object > ();
    @SerializedName("имяКраткое")
    @Expose
    private String имяКраткое;
    @SerializedName("имяПолное")
    @Expose
    private String имяПолное;
    @SerializedName("инн")
    @Expose
    private String инн;
    @SerializedName("огрн")
    @Expose
    private String огрн;
    @SerializedName("СвАдресObject")
    @Expose
    СвАдрес СвАдресObject;
    @SerializedName("ОснВидДеятельностиObject")
    @Expose
    ОснВидДеятельности ОснВидДеятельностиObject;
    @SerializedName("ОтрасльObject")
    @Expose
    Отрасль ОтрасльObject;
    @SerializedName("ПодотрасльObject")
    @Expose
    Подотрасль ПодотрасльObject;
    @SerializedName("свЗап")
    @Expose
    ArrayList < Object > свЗап = new ArrayList < Object > ();
    @SerializedName("свЛицензия")
    @Expose
    ArrayList < Object > свЛицензия = new ArrayList < Object > ();
    @SerializedName("СвРегОргObject")
    @Expose
    СвРегОрг СвРегОргObject;
    @SerializedName("СвРегПФObject")
    @Expose
    СвРегПФ СвРегПФObject;
    @SerializedName("СвРегФССObject")
    @Expose
    СвРегФСС СвРегФССObject;
    @SerializedName("свУпрОрг")
    @Expose
    ArrayList < Object > свУпрОрг = new ArrayList < Object > ();
    @SerializedName("СвДолжнФЛObject")
    @Expose
    СвДолжнФЛ СвДолжнФЛObject;
    @SerializedName("УчрФЛObject")
    @Expose
    УчрФЛ УчрФЛObject;
    @SerializedName("УчрЮЛИнObject")
    @Expose
    УчрЮЛИн УчрЮЛИнObject;
    @SerializedName("СвУчетНОObject")
    @Expose
    СвУчетНО СвУчетНОObject;
    @SerializedName("СтатусГРНДатаObject")
    @Expose
    СтатусГРНДата СтатусГРНДатаObject;
    @SerializedName("статусКод")
    @Expose
    private String статусКод;
    @SerializedName("статусНаим")
    @Expose
    private String статусНаим;
    @SerializedName("тип")
    @Expose
    private String тип;


        // Getter Methods

        public String getEmail() {
            return email;
        }

        public EmailГрнДата getEmailГрнДата() {
            return EmailГрнДатаObject;
        }

        public String getId() {
            return id;
        }

        public String getSource() {
            return source;
        }

        public String getUpdate() {
            return update;
        }

        public float getVersion() {
            return version;
        }

        public String getДатаВып() {
            return датаВып;
        }

        public String getДатаОгрн() {
            return датаОгрн;
        }

        public String getИмяКраткое() {
            return имяКраткое;
        }

        public String getИмяПолное() {
            return имяПолное;
        }

        public String getИнн() {
            return инн;
        }

        public String getОгрн() {
            return огрн;
        }

        public СвАдрес getСвАдрес() {
            return СвАдресObject;
        }

        public ОснВидДеятельности getОснВидДеятельности() {
            return ОснВидДеятельностиObject;
        }

        public Отрасль getОтрасль() {
            return ОтрасльObject;
        }

        public Подотрасль getПодотрасль() {
            return ПодотрасльObject;
        }

        public СвРегОрг getСвРегОрг() {
            return СвРегОргObject;
        }

        public СвРегПФ getСвРегПФ() {
            return СвРегПФObject;
        }

        public СвРегФСС getСвРегФСС() {
            return СвРегФССObject;
        }

        public СвДолжнФЛ getСвДолжнФЛ() {
            return СвДолжнФЛObject;
        }

        public УчрФЛ getУчрФЛ() {
            return УчрФЛObject;
        }

        public УчрЮЛИн getУчрЮЛИн() {
            return УчрЮЛИнObject;
        }

        public СвУчетНО getСвУчетНО() {
            return СвУчетНОObject;
        }

        public СтатусГРНДата getСтатусГРНДата() {
            return СтатусГРНДатаObject;
        }

        public String getСтатусКод() {
            return статусКод;
        }

        public String getСтатусНаим() {
            return статусНаим;
        }

        public String getТип() {
            return тип;
        }

        // Setter Methods

        public void setEmail(String email) {
            this.email = email;
        }

        public void setEmailГрнДата(EmailГрнДата emailГрнДатаObject) {
            this.EmailГрнДатаObject = emailГрнДатаObject;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public void setUpdate(String update) {
            this.update = update;
        }

        public void setVersion(float version) {
            this.version = version;
        }

        public void setДатаВып(String датаВып) {
            this.датаВып = датаВып;
        }

        public void setДатаОгрн(String датаОгрн) {
            this.датаОгрн = датаОгрн;
        }

        public void setИмяКраткое(String имяКраткое) {
            this.имяКраткое = имяКраткое;
        }

        public void setИмяПолное(String имяПолное) {
            this.имяПолное = имяПолное;
        }

        public void setИнн(String инн) {
            this.инн = инн;
        }

        public void setОгрн(String огрн) {
            this.огрн = огрн;
        }

        public void setСвАдрес(СвАдрес свАдресObject) {
            this.СвАдресObject = свАдресObject;
        }

        public void setОснВидДеятельности(ОснВидДеятельности оснВидДеятельностиObject) {
            this.ОснВидДеятельностиObject = оснВидДеятельностиObject;
        }

        public void setОтрасль(Отрасль отрасльObject) {
            this.ОтрасльObject = отрасльObject;
        }

        public void setПодотрасль(Подотрасль подотрасльObject) {
            this.ПодотрасльObject = подотрасльObject;
        }

        public void setСвРегОрг(СвРегОрг свРегОргObject) {
            this.СвРегОргObject = свРегОргObject;
        }

        public void setСвРегПФ(СвРегПФ свРегПФObject) {
            this.СвРегПФObject = свРегПФObject;
        }

        public void setСвРегФСС(СвРегФСС свРегФССObject) {
            this.СвРегФССObject = свРегФССObject;
        }

        public void setСвДолжнФЛ(СвДолжнФЛ свДолжнФЛObject) {
            this.СвДолжнФЛObject = свДолжнФЛObject;
        }

        public void setУчрФЛ(УчрФЛ учрФЛObject) {
            this.УчрФЛObject = учрФЛObject;
        }

        public void setУчрЮЛИн(УчрЮЛИн учрЮЛИнObject) {
            this.УчрЮЛИнObject = учрЮЛИнObject;
        }

        public void setСвУчетНО(СвУчетНО свУчетНОObject) {
            this.СвУчетНОObject = свУчетНОObject;
        }

        public void setСтатусГРНДата(СтатусГРНДата статусГРНДатаObject) {
            this.СтатусГРНДатаObject = статусГРНДатаObject;
        }

        public void setСтатусКод(String статусКод) {
            this.статусКод = статусКод;
        }

        public void setСтатусНаим(String статусНаим) {
            this.статусНаим = статусНаим;
        }

        public void setТип(String тип) {
            this.тип = тип;
        }
    }
    class СтатусГРНДата {
        @SerializedName("грн")
        @Expose
        private String грн;
        @SerializedName("дата")
        @Expose
        private String дата;


        // Getter Methods

        public String getГрн() {
            return грн;
        }

        public String getДата() {
            return дата;
        }

        // Setter Methods

        public void setГрн(String грн) {
            this.грн = грн;
        }

        public void setДата(String дата) {
            this.дата = дата;
        }
    }
    class СвУчетНО {
        @SerializedName("ГрнДатаObject")
        @Expose
        ГрнДата ГрнДатаObject;
        @SerializedName("датаПостУч")
        @Expose
        private String датаПостУч;
        @SerializedName("кодНО")
        @Expose
        private String кодНО;
        @SerializedName("наимНО")
        @Expose
        private String наимНО;


        // Getter Methods

        public ГрнДата getГрнДата() {
            return ГрнДатаObject;
        }

        public String getДатаПостУч() {
            return датаПостУч;
        }

        public String getКодНО() {
            return кодНО;
        }

        public String getНаимНО() {
            return наимНО;
        }

        // Setter Methods

        public void setГрнДата(ГрнДата грнДатаObject) {
            this.ГрнДатаObject = грнДатаObject;
        }

        public void setДатаПостУч(String датаПостУч) {
            this.датаПостУч = датаПостУч;
        }

        public void setКодНО(String кодНО) {
            this.кодНО = кодНО;
        }

        public void setНаимНО(String наимНО) {
            this.наимНО = наимНО;
        }
    }
    class ГрнДата {
        @SerializedName("грн")
        @Expose
        private String грн;
        @SerializedName("дата")
        @Expose
        private String дата;


        // Getter Methods

        public String getГрн() {
            return грн;
        }

        public String getДата() {
            return дата;
        }

        // Setter Methods

        public void setГрн(String грн) {
            this.грн = грн;
        }

        public void setДата(String дата) {
            this.дата = дата;
        }
    }
    class УчрЮЛИн {
        @SerializedName("адрСтр")
        @Expose
        private String адрСтр;
        @SerializedName("датаРег")
        @Expose
        private String датаРег;
        @SerializedName("доляУстКап")
        @Expose
        private String доляУстКап;
        @SerializedName("инн")
        @Expose
        private String инн;
        @SerializedName("наимПолн")
        @Expose
        private String наимПолн;
        @SerializedName("наимРегОрг")
        @Expose
        private String наимРегОрг;
        @SerializedName("оксм")
        @Expose
        private String оксм;
        @SerializedName("регНомер")
        @Expose
        private String регНомер;
        @SerializedName("СвНедДанУчрObject")
        @Expose
        СвНедДанУчр СвНедДанУчрObject;
        @SerializedName("СвОбремObject")
        @Expose
        СвОбрем СвОбремObject;
        @SerializedName("ГрнДатаObject")
        @Expose
        ГрнДата ГрнДатаObject;


        // Getter Methods

        public String getАдрСтр() {
            return адрСтр;
        }

        public String getДатаРег() {
            return датаРег;
        }

        public String getДоляУстКап() {
            return доляУстКап;
        }

        public String getИнн() {
            return инн;
        }

        public String getНаимПолн() {
            return наимПолн;
        }

        public String getНаимРегОрг() {
            return наимРегОрг;
        }

        public String getОксм() {
            return оксм;
        }

        public String getРегНомер() {
            return регНомер;
        }

        public СвНедДанУчр getСвНедДанУчр() {
            return СвНедДанУчрObject;
        }

        public СвОбрем getСвОбрем() {
            return СвОбремObject;
        }

        public ГрнДата getГрнДата() {
            return ГрнДатаObject;
        }

        // Setter Methods

        public void setАдрСтр(String адрСтр) {
            this.адрСтр = адрСтр;
        }

        public void setДатаРег(String датаРег) {
            this.датаРег = датаРег;
        }

        public void setДоляУстКап(String доляУстКап) {
            this.доляУстКап = доляУстКап;
        }

        public void setИнн(String инн) {
            this.инн = инн;
        }

        public void setНаимПолн(String наимПолн) {
            this.наимПолн = наимПолн;
        }

        public void setНаимРегОрг(String наимРегОрг) {
            this.наимРегОрг = наимРегОрг;
        }

        public void setОксм(String оксм) {
            this.оксм = оксм;
        }

        public void setРегНомер(String регНомер) {
            this.регНомер = регНомер;
        }

        public void setСвНедДанУчр(СвНедДанУчр свНедДанУчрObject) {
            this.СвНедДанУчрObject = свНедДанУчрObject;
        }

        public void setСвОбрем(СвОбрем свОбремObject) {
            this.СвОбремObject = свОбремObject;
        }

        public void setГрнДата(ГрнДата грнДатаObject) {
            this.ГрнДатаObject = грнДатаObject;
        }
    }

class СвОбрем {
    @SerializedName("СвЗалогДержФЛObject")
    @Expose
    СвЗалогДержФЛ СвЗалогДержФЛObject;
    @SerializedName("СвЗалогДержЮЛObject")
    @Expose
    СвЗалогДержЮЛ СвЗалогДержЮЛObject;
    @SerializedName("видОбрем")
    @Expose
    private String видОбрем;
    @SerializedName("срокОбременения")
    @Expose
    private String срокОбременения;


        // Getter Methods

        public СвЗалогДержФЛ getСвЗалогДержФЛ() {
            return СвЗалогДержФЛObject;
        }

        public СвЗалогДержЮЛ getСвЗалогДержЮЛ() {
            return СвЗалогДержЮЛObject;
        }

        public String getВидОбрем() {
            return видОбрем;
        }

        public String getСрокОбременения() {
            return срокОбременения;
        }

        // Setter Methods

        public void setСвЗалогДержФЛ(СвЗалогДержФЛ свЗалогДержФЛObject) {
            this.СвЗалогДержФЛObject = свЗалогДержФЛObject;
        }

        public void setСвЗалогДержЮЛ(СвЗалогДержЮЛ свЗалогДержЮЛObject) {
            this.СвЗалогДержЮЛObject = свЗалогДержЮЛObject;
        }

        public void setВидОбрем(String видОбрем) {
            this.видОбрем = видОбрем;
        }

        public void setСрокОбременения(String срокОбременения) {
            this.срокОбременения = срокОбременения;
        }
    }
    class СвЗалогДержЮЛ {
        @SerializedName("НаимИННЮЛObject")
        @Expose
        НаимИННЮЛ НаимИННЮЛObject;
        @SerializedName("СвРегИнObject")
        @Expose
        СвРегИн СвРегИнObject;


        // Getter Methods

        public НаимИННЮЛ getНаимИННЮЛ() {
            return НаимИННЮЛObject;
        }

        public СвРегИн getСвРегИн() {
            return СвРегИнObject;
        }

        // Setter Methods

        public void setНаимИННЮЛ(НаимИННЮЛ наимИННЮЛObject) {
            this.НаимИННЮЛObject = наимИННЮЛObject;
        }

        public void setСвРегИн(СвРегИн свРегИнObject) {
            this.СвРегИнObject = свРегИнObject;
        }
    }
    class СвРегИн {
        @SerializedName("адрСтр")
        @Expose
        private String адрСтр;
        @SerializedName("наимСтран")
        @Expose
        private String наимСтран;


        // Getter Methods

        public String getАдрСтр() {
            return адрСтр;
        }

        public String getНаимСтран() {
            return наимСтран;
        }

        // Setter Methods

        public void setАдрСтр(String адрСтр) {
            this.адрСтр = адрСтр;
        }

        public void setНаимСтран(String наимСтран) {
            this.наимСтран = наимСтран;
        }
    }
    class НаимИННЮЛ {
        @SerializedName("инн")
        @Expose
        private String инн;
        @SerializedName("наимЮЛПолн")
        @Expose
        private String наимЮЛПолн;
        @SerializedName("огрн")
        @Expose
        private String огрн;


        // Getter Methods

        public String getИнн() {
            return инн;
        }

        public String getНаимЮЛПолн() {
            return наимЮЛПолн;
        }

        public String getОгрн() {
            return огрн;
        }

        // Setter Methods

        public void setИнн(String инн) {
            this.инн = инн;
        }

        public void setНаимЮЛПолн(String наимЮЛПолн) {
            this.наимЮЛПолн = наимЮЛПолн;
        }

        public void setОгрн(String огрн) {
            this.огрн = огрн;
        }
    }
    class СвЗалогДержФЛ {
        @SerializedName("СвФЛObject")
        @Expose
        СвФЛ СвФЛObject;


        // Getter Methods

        public СвФЛ getСвФЛ() {
            return СвФЛObject;
        }

        // Setter Methods

        public void setСвФЛ(СвФЛ свФЛObject) {
            this.СвФЛObject = свФЛObject;
        }
    }
    class СвФЛ {
        @SerializedName("имя")
        @Expose
        private String имя;
        @SerializedName("отчество")
        @Expose
        private String отчество;
        @SerializedName("фамилия")
        @Expose
        private String фамилия;
        @SerializedName("иннФЛ")
        @Expose
        private String иннФЛ;


        // Getter Methods

        public String getИмя() {
            return имя;
        }

        public String getОтчество() {
            return отчество;
        }

        public String getФамилия() {
            return фамилия;
        }

        public String getИннФЛ() {
            return иннФЛ;
        }

        // Setter Methods

        public void setИмя(String имя) {
            this.имя = имя;
        }

        public void setОтчество(String отчество) {
            this.отчество = отчество;
        }

        public void setФамилия(String фамилия) {
            this.фамилия = фамилия;
        }

        public void setИннФЛ(String иннФЛ) {
            this.иннФЛ = иннФЛ;
        }
    }
    class СвНедДанУчр {
        @SerializedName("ГрнДатаObject")
        @Expose
        ГрнДата ГрнДатаObject;
        @SerializedName("РешСудObject")
        @Expose
        РешСуд РешСудObject;
        @SerializedName("признНед")
        @Expose
        private String признНед;
        @SerializedName("текстНед")
        @Expose
        private String текстНед;


        // Getter Methods

        public ГрнДата getГрнДата() {
            return ГрнДатаObject;
        }

        public РешСуд getРешСуд() {
            return РешСудObject;
        }

        public String getПризнНед() {
            return признНед;
        }

        public String getТекстНед() {
            return текстНед;
        }

        // Setter Methods

        public void setГрнДата(ГрнДата грнДатаObject) {
            this.ГрнДатаObject = грнДатаObject;
        }

        public void setРешСуд(РешСуд решСудObject) {
            this.РешСудObject = решСудObject;
        }

        public void setПризнНед(String признНед) {
            this.признНед = признНед;
        }

        public void setТекстНед(String текстНед) {
            this.текстНед = текстНед;
        }
    }
    class РешСуд {
        @SerializedName("дата")
        @Expose
        private String дата;
        @SerializedName("наимСуда")
        @Expose
        private String наимСуда;
        @SerializedName("номер")
        @Expose
        private String номер;



        // Getter Methods

        public String getДата() {
            return дата;
        }

        public String getНаимСуда() {
            return наимСуда;
        }

        public String getНомер() {
            return номер;
        }

        // Setter Methods

        public void setДата(String дата) {
            this.дата = дата;
        }

        public void setНаимСуда(String наимСуда) {
            this.наимСуда = наимСуда;
        }

        public void setНомер(String номер) {
            this.номер = номер;
        }
    }

class УчрФЛ {
    @SerializedName("ФиоObject")
    @Expose
    Фио ФиоObject;
    @SerializedName("инн")
    @Expose
    private String инн;
    @SerializedName("СвНедДанУчрObject")
    @Expose
    СвНедДанУчр СвНедДанУчрObject;
    @SerializedName("ГрнДатаObject")
    @Expose
    ГрнДата ГрнДатаObject;


        // Getter Methods

        public Фио getФио() {
            return ФиоObject;
        }

        public String getИнн() {
            return инн;
        }

        public СвНедДанУчр getСвНедДанУчр() {
            return СвНедДанУчрObject;
        }

        public ГрнДата getГрнДата() {
            return ГрнДатаObject;
        }

        // Setter Methods

        public void setФио(Фио фиоObject) {
            this.ФиоObject = фиоObject;
        }

        public void setИнн(String инн) {
            this.инн = инн;
        }

        public void setСвНедДанУчр(СвНедДанУчр свНедДанУчрObject) {
            this.СвНедДанУчрObject = свНедДанУчрObject;
        }

        public void setГрнДата(ГрнДата грнДатаObject) {
            this.ГрнДатаObject = грнДатаObject;
        }
    }

class Фио {
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("patronymic")
    @Expose
    private String patronymic;


        // Getter Methods

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getPatronymic() {
            return patronymic;
        }

        // Setter Methods

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setPatronymic(String patronymic) {
            this.patronymic = patronymic;
        }
    }
    class СвДолжнФЛ {
        @SerializedName("ФиоObject")
        @Expose
        Фио ФиоObject;
        @SerializedName("инн")
        @Expose
        private String инн;
        @SerializedName("видДолжн")
        @Expose
        private String видДолжн;
        @SerializedName("наимВидДолжн")
        @Expose
        private String наимВидДолжн;
        @SerializedName("наимДолжн")
        @Expose
        private String наимДолжн;
        @SerializedName("СвНедДанДолжнФЛObject")
        @Expose
        СвНедДанДолжнФЛ СвНедДанДолжнФЛObject;
        @SerializedName("ГрнДатаObject")
        @Expose
        ГрнДата ГрнДатаObject;


        // Getter Methods

        public Фио getФио() {
            return ФиоObject;
        }

        public String getИнн() {
            return инн;
        }

        public String getВидДолжн() {
            return видДолжн;
        }

        public String getНаимВидДолжн() {
            return наимВидДолжн;
        }

        public String getНаимДолжн() {
            return наимДолжн;
        }

        public СвНедДанДолжнФЛ getСвНедДанДолжнФЛ() {
            return СвНедДанДолжнФЛObject;
        }

        public ГрнДата getГрнДата() {
            return ГрнДатаObject;
        }

        // Setter Methods

        public void setФио(Фио фиоObject) {
            this.ФиоObject = фиоObject;
        }

        public void setИнн(String инн) {
            this.инн = инн;
        }

        public void setВидДолжн(String видДолжн) {
            this.видДолжн = видДолжн;
        }

        public void setНаимВидДолжн(String наимВидДолжн) {
            this.наимВидДолжн = наимВидДолжн;
        }

        public void setНаимДолжн(String наимДолжн) {
            this.наимДолжн = наимДолжн;
        }

        public void setСвНедДанДолжнФЛ(СвНедДанДолжнФЛ свНедДанДолжнФЛObject) {
            this.СвНедДанДолжнФЛObject = свНедДанДолжнФЛObject;
        }

        public void setГрнДата(ГрнДата грнДатаObject) {
            this.ГрнДатаObject = грнДатаObject;
        }
    }

class СвНедДанДолжнФЛ {
    @SerializedName("ГрнДатаObject")
    @Expose
    ГрнДата ГрнДатаObject;
    @SerializedName("ГрнДатаИспрObject")
    @Expose
    ГрнДатаИспр ГрнДатаИспрObject;
    @SerializedName("признНед")
    @Expose
    private String признНед;
    @SerializedName("текстНед")
    @Expose
    private String текстНед;


        // Getter Methods

        public ГрнДата getГрнДата() {
            return ГрнДатаObject;
        }

        public ГрнДатаИспр getГрнДатаИспр() {
            return ГрнДатаИспрObject;
        }

        public String getПризнНед() {
            return признНед;
        }

        public String getТекстНед() {
            return текстНед;
        }

        // Setter Methods

        public void setГрнДата(ГрнДата грнДатаObject) {
            this.ГрнДатаObject = грнДатаObject;
        }

        public void setГрнДатаИспр(ГрнДатаИспр грнДатаИспрObject) {
            this.ГрнДатаИспрObject = грнДатаИспрObject;
        }

        public void setПризнНед(String признНед) {
            this.признНед = признНед;
        }

        public void setТекстНед(String текстНед) {
            this.текстНед = текстНед;
        }
    }
    class ГрнДатаИспр {
        @SerializedName("грн")
        @Expose
        private String грн;
        @SerializedName("дата")
        @Expose
        private String дата;


        // Getter Methods

        public String getГрн() {
            return грн;
        }

        public String getДата() {
            return дата;
        }

        // Setter Methods

        public void setГрн(String грн) {
            this.грн = грн;
        }

        public void setДата(String дата) {
            this.дата = дата;
        }
    }

class СвРегФСС {
    @SerializedName("ГрнДатаObject")
    @Expose
    ГрнДата ГрнДатаObject;
    @SerializedName("датаРег")
    @Expose
    private String датаРег;
    @SerializedName("кодФСС")
    @Expose
    private String кодФСС;
    @SerializedName("наимФСС")
    @Expose
    private String наимФСС;
    @SerializedName("регНомФСС")
    @Expose
    private String регНомФСС;


        // Getter Methods

        public ГрнДата getГрнДата() {
            return ГрнДатаObject;
        }

        public String getДатаРег() {
            return датаРег;
        }

        public String getКодФСС() {
            return кодФСС;
        }

        public String getНаимФСС() {
            return наимФСС;
        }

        public String getРегНомФСС() {
            return регНомФСС;
        }

        // Setter Methods

        public void setГрнДата(ГрнДата грнДатаObject) {
            this.ГрнДатаObject = грнДатаObject;
        }

        public void setДатаРег(String датаРег) {
            this.датаРег = датаРег;
        }

        public void setКодФСС(String кодФСС) {
            this.кодФСС = кодФСС;
        }

        public void setНаимФСС(String наимФСС) {
            this.наимФСС = наимФСС;
        }

        public void setРегНомФСС(String регНомФСС) {
            this.регНомФСС = регНомФСС;
        }
    }

class СвРегПФ {
    @SerializedName("ГрнДатаObject")
    @Expose
    ГрнДата ГрнДатаObject;
    @SerializedName("датаРег")
    @Expose
    private String датаРег;
    @SerializedName("кодПФ")
    @Expose
    private String кодПФ;
    @SerializedName("наимПФ")
    @Expose
    private String наимПФ;
    @SerializedName("регНомПФ")
    @Expose
    private String регНомПФ;


        // Getter Methods

        public ГрнДата getГрнДата() {
            return ГрнДатаObject;
        }

        public String getДатаРег() {
            return датаРег;
        }

        public String getКодПФ() {
            return кодПФ;
        }

        public String getНаимПФ() {
            return наимПФ;
        }

        public String getРегНомПФ() {
            return регНомПФ;
        }

        // Setter Methods

        public void setГрнДата(ГрнДата грнДатаObject) {
            this.ГрнДатаObject = грнДатаObject;
        }

        public void setДатаРег(String датаРег) {
            this.датаРег = датаРег;
        }

        public void setКодПФ(String кодПФ) {
            this.кодПФ = кодПФ;
        }

        public void setНаимПФ(String наимПФ) {
            this.наимПФ = наимПФ;
        }

        public void setРегНомПФ(String регНомПФ) {
            this.регНомПФ = регНомПФ;
        }
    }

class СвРегОрг {
    @SerializedName("адрРО")
    @Expose
    private String адрРО;
    @SerializedName("ГрнДатаObject")
    @Expose
    ГрнДата ГрнДатаObject;
    @SerializedName("кодНО")
    @Expose
    private String кодНО;
    @SerializedName("наимНО")
    @Expose
    private String наимНО;


        // Getter Methods

        public String getАдрРО() {
            return адрРО;
        }

        public ГрнДата getГрнДата() {
            return ГрнДатаObject;
        }

        public String getКодНО() {
            return кодНО;
        }

        public String getНаимНО() {
            return наимНО;
        }

        // Setter Methods

        public void setАдрРО(String адрРО) {
            this.адрРО = адрРО;
        }

        public void setГрнДата(ГрнДата грнДатаObject) {
            this.ГрнДатаObject = грнДатаObject;
        }

        public void setКодНО(String кодНО) {
            this.кодНО = кодНО;
        }

        public void setНаимНО(String наимНО) {
            this.наимНО = наимНО;
        }
    }

class Подотрасль {
    @SerializedName("код")
    @Expose
    private String код;
    @SerializedName("наим")
    @Expose
    private String наим;


        // Getter Methods

        public String getКод() {
            return код;
        }

        public String getНаим() {
            return наим;
        }

        // Setter Methods

        public void setКод(String код) {
            this.код = код;
        }

        public void setНаим(String наим) {
            this.наим = наим;
        }
    }
    class Отрасль {
        @SerializedName("код")
        @Expose
        private String код;
        @SerializedName("наим")
        @Expose
        private String наим;


        // Getter Methods

        public String getКод() {
            return код;
        }

        public String getНаим() {
            return наим;
        }

        // Setter Methods

        public void setКод(String код) {
            this.код = код;
        }

        public void setНаим(String наим) {
            this.наим = наим;
        }
    }
    class ОснВидДеятельности {
        @SerializedName("версия")
        @Expose
        private String версия;
        @SerializedName("ГрнObject")
        @Expose
        Грн ГрнObject;
        @SerializedName("код")
        @Expose
        private String код;
        @SerializedName("наим")
        @Expose
        private String наим;


        // Getter Methods

        public String getВерсия() {
            return версия;
        }

        public Грн getГрн() {
            return ГрнObject;
        }

        public String getКод() {
            return код;
        }

        public String getНаим() {
            return наим;
        }

        // Setter Methods

        public void setВерсия(String версия) {
            this.версия = версия;
        }

        public void setГрн(Грн грнObject) {
            this.ГрнObject = грнObject;
        }

        public void setКод(String код) {
            this.код = код;
        }

        public void setНаим(String наим) {
            this.наим = наим;
        }
    }
    class Грн {
        @SerializedName("грн")
        @Expose
        private String грн;
        @SerializedName("дата")
        @Expose
        private String дата;


        // Getter Methods

        public String getГрн() {
            return грн;
        }

        public String getДата() {
            return дата;
        }

        // Setter Methods

        public void setГрн(String грн) {
            this.грн = грн;
        }

        public void setДата(String дата) {
            this.дата = дата;
        }
    }
    class СвАдрес {
        @SerializedName("АдресРФObject")
        @Expose
        АдресРФ АдресРФObject;
        @SerializedName("СвНедАдресЮЛObject")
        @Expose
        СвНедАдресЮЛ СвНедАдресЮЛObject;


        // Getter Methods

        public АдресРФ getАдресРФ() {
            return АдресРФObject;
        }

        public СвНедАдресЮЛ getСвНедАдресЮЛ() {
            return СвНедАдресЮЛObject;
        }

        // Setter Methods

        public void setАдресРФ(АдресРФ адресРФObject) {
            this.АдресРФObject = адресРФObject;
        }

        public void setСвНедАдресЮЛ(СвНедАдресЮЛ свНедАдресЮЛObject) {
            this.СвНедАдресЮЛObject = свНедАдресЮЛObject;
        }
    }
    class СвНедАдресЮЛ {
        @SerializedName("ГрнДатаObject")
        @Expose
        ГрнДата ГрнДатаObject;
        @SerializedName("ГрнДатаИспрObject")
        @Expose
        ГрнДатаИспр ГрнДатаИспрObject;
        @SerializedName("признНед")
        @Expose
        private String признНед;
        @SerializedName("текстНед")
        @Expose
        private String текстНед;


        // Getter Methods

        public ГрнДата getГрнДата() {
            return ГрнДатаObject;
        }

        public ГрнДатаИспр getГрнДатаИспр() {
            return ГрнДатаИспрObject;
        }

        public String getПризнНед() {
            return признНед;
        }

        public String getТекстНед() {
            return текстНед;
        }

        // Setter Methods

        public void setГрнДата(ГрнДата грнДатаObject) {
            this.ГрнДатаObject = грнДатаObject;
        }

        public void setГрнДатаИспр(ГрнДатаИспр грнДатаИспрObject) {
            this.ГрнДатаИспрObject = грнДатаИспрObject;
        }

        public void setПризнНед(String признНед) {
            this.признНед = признНед;
        }

        public void setТекстНед(String текстНед) {
            this.текстНед = текстНед;
        }
    }

class АдресРФ {
    @SerializedName("ГородObject")
    @Expose
    Город ГородObject;
    @SerializedName("ГрнДатаObject")
    @Expose
    ГрнДата ГрнДатаObject;
    @SerializedName("дом")
    @Expose
    private String дом;
    @SerializedName("индекс")
    @Expose
    private String индекс;
    @SerializedName("кварт")
    @Expose
    private String кварт;
    @SerializedName("кодАдрКладр")
    @Expose
    private String кодАдрКладр;
    @SerializedName("кодРегион")
    @Expose
    private String кодРегион;
    @SerializedName("корпус")
    @Expose
    private String корпус;
    @SerializedName("НаселПунктObject")
    @Expose
    НаселПункт НаселПунктObject;
    @SerializedName("РайонObject")
    @Expose
    Район РайонObject;
    @SerializedName("РегионObject")
    @Expose
    Регион РегионObject;
    @SerializedName("УлицаObject")
    @Expose
    Улица УлицаObject;


        // Getter Methods

        public Город getГород() {
            return ГородObject;
        }

        public ГрнДата getГрнДата() {
            return ГрнДатаObject;
        }

        public String getДом() {
            return дом;
        }

        public String getИндекс() {
            return индекс;
        }

        public String getКварт() {
            return кварт;
        }

        public String getКодАдрКладр() {
            return кодАдрКладр;
        }

        public String getКодРегион() {
            return кодРегион;
        }

        public String getКорпус() {
            return корпус;
        }

        public НаселПункт getНаселПункт() {
            return НаселПунктObject;
        }

        public Район getРайон() {
            return РайонObject;
        }

        public Регион getРегион() {
            return РегионObject;
        }

        public Улица getУлица() {
            return УлицаObject;
        }

        // Setter Methods

        public void setГород(Город городObject) {
            this.ГородObject = городObject;
        }

        public void setГрнДата(ГрнДата грнДатаObject) {
            this.ГрнДатаObject = грнДатаObject;
        }

        public void setДом(String дом) {
            this.дом = дом;
        }

        public void setИндекс(String индекс) {
            this.индекс = индекс;
        }

        public void setКварт(String кварт) {
            this.кварт = кварт;
        }

        public void setКодАдрКладр(String кодАдрКладр) {
            this.кодАдрКладр = кодАдрКладр;
        }

        public void setКодРегион(String кодРегион) {
            this.кодРегион = кодРегион;
        }

        public void setКорпус(String корпус) {
            this.корпус = корпус;
        }

        public void setНаселПункт(НаселПункт населПунктObject) {
            this.НаселПунктObject = населПунктObject;
        }

        public void setРайон(Район районObject) {
            this.РайонObject = районObject;
        }

        public void setРегион(Регион регионObject) {
            this.РегионObject = регионObject;
        }

        public void setУлица(Улица улицаObject) {
            this.УлицаObject = улицаObject;
        }
    }
    class Улица {
        @SerializedName("наименование")
        @Expose
        private String наименование;
        @SerializedName("тип")
        @Expose
        private String тип;


        // Getter Methods

        public String getНаименование() {
            return наименование;
        }

        public String getТип() {
            return тип;
        }

        // Setter Methods

        public void setНаименование(String наименование) {
            this.наименование = наименование;
        }

        public void setТип(String тип) {
            this.тип = тип;
        }
    }
    class Регион {
        @SerializedName("наименование")
        @Expose
        private String наименование;
        @SerializedName("тип")
        @Expose
        private String тип;


        // Getter Methods

        public String getНаименование() {
            return наименование;
        }

        public String getТип() {
            return тип;
        }

        // Setter Methods

        public void setНаименование(String наименование) {
            this.наименование = наименование;
        }

        public void setТип(String тип) {
            this.тип = тип;
        }
    }
    class Район {
        @SerializedName("наименование")
        @Expose
        private String наименование;
        @SerializedName("тип")
        @Expose
        private String тип;


        // Getter Methods

        public String getНаименование() {
            return наименование;
        }

        public String getТип() {
            return тип;
        }

        // Setter Methods

        public void setНаименование(String наименование) {
            this.наименование = наименование;
        }

        public void setТип(String тип) {
            this.тип = тип;
        }
    }
    class НаселПункт {
        @SerializedName("наименование")
        @Expose
        private String наименование;
        @SerializedName("тип")
        @Expose
        private String тип;


        // Getter Methods

        public String getНаименование() {
            return наименование;
        }

        public String getТип() {
            return тип;
        }

        // Setter Methods

        public void setНаименование(String наименование) {
            this.наименование = наименование;
        }

        public void setТип(String тип) {
            this.тип = тип;
        }
    }

class Город {
    @SerializedName("наименование")
    @Expose
    private String наименование;
    @SerializedName("тип")
    @Expose
    private String тип;


        // Getter Methods

        public String getНаименование() {
            return наименование;
        }

        public String getТип() {
            return тип;
        }

        // Setter Methods

        public void setНаименование(String наименование) {
            this.наименование = наименование;
        }

        public void setТип(String тип) {
            this.тип = тип;
        }
    }
    class EmailГрнДата {
        @SerializedName("грн")
        @Expose
        private String грн;
        @SerializedName("дата")
        @Expose
        private String дата;


        // Getter Methods

        public String getГрн() {
            return грн;
        }

        public String getДата() {
            return дата;
        }

        // Setter Methods

        public void setГрн(String грн) {
            this.грн = грн;
        }

        public void setДата(String дата) {
            this.дата = дата;
        }
    }

