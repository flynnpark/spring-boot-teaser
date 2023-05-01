package dev.flynnpark.springbootteaser.repository;

import dev.flynnpark.springbootteaser.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);

    Optional<Member> findById(Long id);

    Optional<Member> findByName(String name);

    List<Member> findAll();

}
