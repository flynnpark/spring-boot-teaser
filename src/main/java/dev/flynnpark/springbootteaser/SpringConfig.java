package dev.flynnpark.springbootteaser;

import dev.flynnpark.springbootteaser.repository.MemberRepository;
import dev.flynnpark.springbootteaser.repository.MemoryMemberRepository;
import dev.flynnpark.springbootteaser.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
