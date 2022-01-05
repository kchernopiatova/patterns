package com.solvd.patterns.facade;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.annotations.Test;

/*
Данный паттерн используется для того, чтобы скрыть сложность действий внутри определенного процесса
Вместо вызова множества методов, все они объединяются в один, который и выывается в последующем
Это помогает избежать повторения кода при использовании этих методов много раз
 */
public class FacadeMain implements IAbstractTest {

    @Test
    public void FacadeTest() {
        OnlinerInterface onlinerInterface = new OnlinerInterface();
        onlinerInterface.switchPages();
    }
}
