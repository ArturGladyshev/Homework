package PluginManager;

//Интерфейс для всех плагинов в данном приложении (не очень хорошее решение, так как интерфейс ограничен, и все загружаемые классы должны
// его наследовать). Но если использовать в рамках своей реализации, то возможно, может быть полезным, возможно даже более полезным,
//чем загрузка класса и использование рефлексии.

public interface Plugin {

    Class<?> getPluginClass();
    String getPluginName();
    void doUsefull();

}


