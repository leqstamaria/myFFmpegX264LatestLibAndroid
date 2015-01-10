/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.android.myffmpegx264lib;

public class frameEncoder {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected frameEncoder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(frameEncoder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        frameEncoderInterfaceJNI.delete_frameEncoder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public frameEncoder() {
    this(frameEncoderInterfaceJNI.new_frameEncoder(), true);
  }

  public boolean open() {
    return frameEncoderInterfaceJNI.frameEncoder_open(swigCPtr, this);
  }

  public void encodeFrame(byte[] inBytes, int frameSize, int pts, byte[] outBytes, int[] outFrameSize) {
    frameEncoderInterfaceJNI.frameEncoder_encodeFrame(swigCPtr, this, inBytes, frameSize, pts, outBytes, outFrameSize);
  }

  public boolean close() {
    return frameEncoderInterfaceJNI.frameEncoder_close(swigCPtr, this);
  }

  public boolean validateSettings() {
    return frameEncoderInterfaceJNI.frameEncoder_validateSettings(swigCPtr, this);
  }

  public void setParams() {
    frameEncoderInterfaceJNI.frameEncoder_setParams(swigCPtr, this);
  }

  public int getFps() {
    return frameEncoderInterfaceJNI.frameEncoder_getFps(swigCPtr, this);
  }

  public void setFps(int fps) {
    frameEncoderInterfaceJNI.frameEncoder_setFps(swigCPtr, this, fps);
  }

  public int getInHeight() {
    return frameEncoderInterfaceJNI.frameEncoder_getInHeight(swigCPtr, this);
  }

  public void setInHeight(int inHeight) {
    frameEncoderInterfaceJNI.frameEncoder_setInHeight(swigCPtr, this, inHeight);
  }

  public int getInWidth() {
    return frameEncoderInterfaceJNI.frameEncoder_getInWidth(swigCPtr, this);
  }

  public void setInWidth(int inWidth) {
    frameEncoderInterfaceJNI.frameEncoder_setInWidth(swigCPtr, this, inWidth);
  }

  public int getNumNals() {
    return frameEncoderInterfaceJNI.frameEncoder_getNumNals(swigCPtr, this);
  }

  public void setNumNals(int numNals) {
    frameEncoderInterfaceJNI.frameEncoder_setNumNals(swigCPtr, this, numNals);
  }

  public int getOutHeight() {
    return frameEncoderInterfaceJNI.frameEncoder_getOutHeight(swigCPtr, this);
  }

  public void setOutHeight(int outHeight) {
    frameEncoderInterfaceJNI.frameEncoder_setOutHeight(swigCPtr, this, outHeight);
  }

  public int getOutWidth() {
    return frameEncoderInterfaceJNI.frameEncoder_getOutWidth(swigCPtr, this);
  }

  public void setOutWidth(int outWidth) {
    frameEncoderInterfaceJNI.frameEncoder_setOutWidth(swigCPtr, this, outWidth);
  }

  public int getBitrate() {
    return frameEncoderInterfaceJNI.frameEncoder_getBitrate(swigCPtr, this);
  }

  public void setBitrate(int bitrate) {
    frameEncoderInterfaceJNI.frameEncoder_setBitrate(swigCPtr, this, bitrate);
  }

  public int getSliceMaxSize() {
    return frameEncoderInterfaceJNI.frameEncoder_getSliceMaxSize(swigCPtr, this);
  }

  public void setSliceMaxSize(int sliceMaxSize) {
    frameEncoderInterfaceJNI.frameEncoder_setSliceMaxSize(swigCPtr, this, sliceMaxSize);
  }

  public int getVbvBufferSize() {
    return frameEncoderInterfaceJNI.frameEncoder_getVbvBufferSize(swigCPtr, this);
  }

  public void setVbvBufferSize(int vbvBufferSize) {
    frameEncoderInterfaceJNI.frameEncoder_setVbvBufferSize(swigCPtr, this, vbvBufferSize);
  }

  public int getIThreads() {
    return frameEncoderInterfaceJNI.frameEncoder_getIThreads(swigCPtr, this);
  }

  public void setIThreads(int threads) {
    frameEncoderInterfaceJNI.frameEncoder_setIThreads(swigCPtr, this, threads);
  }

  public int getBFrameFrq() {
    return frameEncoderInterfaceJNI.frameEncoder_getBFrameFrq(swigCPtr, this);
  }

  public void setBFrameFrq(int frameFrq) {
    frameEncoderInterfaceJNI.frameEncoder_setBFrameFrq(swigCPtr, this, frameFrq);
  }
  static {
		System.loadLibrary("ffmpeg-x264");
	}
}
