package com.gwt.swf.client.upload;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * @author sharad.gaur
 * 
 */
public class FileObject extends JavaScriptObject {

    protected FileObject() {
    }

    public final native String getCreationdate() /*-{return this.creationdate.toLocaleDateString();}-*/;

    public final native int getFilestatus()/*-{ return this.filestatus;}-*/;

    public final native String getId() /*-{ return this.id;}-*/;

    public final native int getIndex() /*-{ return this.index;}-*/;

    public final native String getModificationdate() /*-{ return this.modificationdate.toLocaleDateString();}-*/;

    public final native String getName()/*-{ try{ return this.name;}catch(e){$wnd.alert(e);}}-*/;

    public final native int getSize()/*-{ return this.size;}-*/;

    public final native String getType() /*-{this.type;l}-*/;

}
