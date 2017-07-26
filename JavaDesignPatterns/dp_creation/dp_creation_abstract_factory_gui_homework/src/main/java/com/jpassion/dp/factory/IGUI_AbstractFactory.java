package com.jpassion.dp.factory;

import com.jpassion.dp.domain.IFrame_AbstractProduct;
import com.jpassion.dp.domain.IMenu_AbstractProduct;
import com.jpassion.dp.domain.ITitleBar_AbstractProduct;

public interface IGUI_AbstractFactory {
  IFrame_AbstractProduct createFrame();
  IMenu_AbstractProduct createMenu();
  ITitleBar_AbstractProduct createTitle();
}
