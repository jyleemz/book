package com.springboot.book.data.repository;

import com.springboot.book.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

// 예제 8.34
// QuerydslPredicateExecutor를 활용하면 더욱 편하게 QueryDSL을 사용할 수 있지만 join이나 fetch 기능은 사용할 수 없다는 단점이 있다.
public interface QProductRepository extends JpaRepository<Product, Long>, QuerydslPredicateExecutor<Product> {


}
