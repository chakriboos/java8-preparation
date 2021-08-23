package com.javaindepth.generics;

public class GenericsDemo {

	public static void main(String[] args) {
		
		//String container
		Container2<String> stringContainer = new ContainerImpl<String>();
	}
	
}

	interface Container2<T> {
		
		void set(T a);

		T get();
	}

	class ContainerImpl<T> implements Container2<T> {

		private T a;

		@Override
		public void set(T a) {
			this.a = a;
		}

		@Override
		public T get() {
			return a;
		}
	}


