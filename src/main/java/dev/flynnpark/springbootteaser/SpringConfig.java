package dev.flynnpark.springbootteaser;

import dev.flynnpark.springbootteaser.aop.TimeTraceAop;
import dev.flynnpark.springbootteaser.repository.MemberRepository;
import dev.flynnpark.springbootteaser.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }
}
