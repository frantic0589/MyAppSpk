package com.example.myappspk.Class;

import java.util.ArrayList;

public class Company {
        private String email;
        EmailГрнДата EmailГрнДатаObject;
        private String id;
        private String source;
        private String update;
        private float version;
        private String датаВып;
        private String датаОгрн;
        ArrayList< Object > допВидДеятельности = new ArrayList < Object > ();
        private String имяКраткое;
        private String имяПолное;
        private String инн;
        private String огрн;
        СвАдрес СвАдресObject;
        ОснВидДеятельности ОснВидДеятельностиObject;
        Отрасль ОтрасльObject;
        Подотрасль ПодотрасльObject;
        ArrayList < Object > свЗап = new ArrayList < Object > ();
        ArrayList < Object > свЛицензия = new ArrayList < Object > ();
        СвРегОрг СвРегОргObject;
        СвРегПФ СвРегПФObject;
        СвРегФСС СвРегФССObject;
        ArrayList < Object > свУпрОрг = new ArrayList < Object > ();
        СвДолжнФЛ СвДолжнФЛObject;
        УчрФЛ УчрФЛObject;
        УчрЮЛИн УчрЮЛИнObject;
        СвУчетНО СвУчетНОObject;
        СтатусГРНДата СтатусГРНДатаObject;
        private String статусКод;
        private String статусНаим;
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
        private String грн;
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
        ГрнДата ГрнДатаObject;
        private String датаПостУч;
        private String кодНО;
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
        private String грн;
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
        private String адрСтр;
        private String датаРег;
        private String доляУстКап;
        private String инн;
        private String наимПолн;
        private String наимРегОрг;
        private String оксм;
        private String регНомер;
        СвНедДанУчр СвНедДанУчрObject;
        СвОбрем СвОбремObject;
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
        СвЗалогДержФЛ СвЗалогДержФЛObject;
        СвЗалогДержЮЛ СвЗалогДержЮЛObject;
        private String видОбрем;
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
        НаимИННЮЛ НаимИННЮЛObject;
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
        private String адрСтр;
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
        private String инн;
        private String наимЮЛПолн;
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
        private String имя;
        private String отчество;
        private String фамилия;
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
        ГрнДата ГрнДатаObject;
        РешСуд РешСудObject;
        private String признНед;
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
        private String дата;
        private String наимСуда;
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
        Фио ФиоObject;
        private String инн;
        СвНедДанУчр СвНедДанУчрObject;
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
        private String firstName;
        private String lastName;
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
        Фио ФиоObject;
        private String инн;
        private String видДолжн;
        private String наимВидДолжн;
        private String наимДолжн;
        СвНедДанДолжнФЛ СвНедДанДолжнФЛObject;
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
        ГрнДата ГрнДатаObject;
        ГрнДатаИспр ГрнДатаИспрObject;
        private String признНед;
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
        private String грн;
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
        ГрнДата ГрнДатаObject;
        private String датаРег;
        private String кодФСС;
        private String наимФСС;
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
        ГрнДата ГрнДатаObject;
        private String датаРег;
        private String кодПФ;
        private String наимПФ;
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
        private String адрРО;
        ГрнДата ГрнДатаObject;
        private String кодНО;
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
        private String код;
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
        private String код;
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
        private String версия;
        Грн ГрнObject;
        private String код;
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
        private String грн;
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
        АдресРФ АдресРФObject;
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
        ГрнДата ГрнДатаObject;
        ГрнДатаИспр ГрнДатаИспрObject;
        private String признНед;
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
        Город ГородObject;
        ГрнДата ГрнДатаObject;
        private String дом;
        private String индекс;
        private String кварт;
        private String кодАдрКладр;
        private String кодРегион;
        private String корпус;
        НаселПункт НаселПунктObject;
        Район РайонObject;
        Регион РегионObject;
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
        private String наименование;
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
        private String наименование;
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
        private String наименование;
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
        private String наименование;
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
        private String наименование;
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
        private String грн;
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

