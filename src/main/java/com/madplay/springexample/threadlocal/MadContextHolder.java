package com.madplay.springexample.threadlocal;

/**
 * @author madplay
 */
public class MadContextHolder {
	public static final ThreadLocal<String> THREAD_LOCAL = ThreadLocal.withInitial(() -> "");
}
