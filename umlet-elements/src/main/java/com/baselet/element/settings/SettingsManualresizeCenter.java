package com.baselet.element.settings;

import java.util.List;

import com.baselet.control.enums.AlignVertical;
import com.baselet.control.enums.ElementStyle;
import com.baselet.element.facet.Facet;
import com.baselet.element.facet.Settings;

public abstract class SettingsManualresizeCenter extends Settings {

	@Override
	public ElementStyle getElementStyle() {
		return ElementStyle.SIMPLE;
	}

	@Override
	protected List<Facet> createFacets() {
		return Settings.MANUALRESIZE;
	}

	@Override
	public AlignVertical getVAlign() {
		return AlignVertical.CENTER;
	}

}
