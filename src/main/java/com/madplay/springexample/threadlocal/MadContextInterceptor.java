package com.madplay.springexample.threadlocal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @author madplay
 */
public class MadContextInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws
		Exception {
		// `id` 파라미터 값 추출
		final String id = request.getParameter("id");

		// 스레드 로컬에 값 저장
		MadContextHolder.THREAD_LOCAL.set(id);

		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
		Exception ex) throws Exception {

		// 스레드 로컬 정보 제거
		MadContextHolder.THREAD_LOCAL.remove();
	}
}
