package com.gwt.swf.client.upload;

/**
 * 
 * @author sharad.gaur
 * 
 */
public interface SWFEventListener {

    public void swfUploadLoaded();

    public void uploadStart(FileObject file);

    public void uploadProgress(int bytes, int totalbytes, FileObject file);

    public void uploadError(int errorCode, String message, FileObject file);

    public void uploadSuccess(boolean receivedResponse, String serverData,
	    FileObject file);

    public void uploadComplete(FileObject file);

    public void fileDialogStart();

    public void fileQueued(FileObject file);

    public void fileQueueError(int errorCode, String message, FileObject file);

    public void fileDialogComplete(int num_file_selected, int num_of_file_qud,
	    int total_num_file_in_qu);

}
