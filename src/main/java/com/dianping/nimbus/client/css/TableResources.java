package com.dianping.nimbus.client.css;

import com.google.gwt.user.cellview.client.CellTable;

public interface TableResources extends CellTable.Resources {
	@Source(value = { "CellTableStyle2.css" })
	CellTable.Style cellTableStyle();
	
}