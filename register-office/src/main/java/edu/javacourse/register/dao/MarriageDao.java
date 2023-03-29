package edu.javacourse.register.dao;

import edu.javacourse.register.business.MarriageManager;
import edu.javacourse.register.domain.MarriageCertificate;
import edu.javacourse.register.view.MarriageRequest;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;import org.springframework.beans.factory.annotation.Value;import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
@Component
@Setter
public class MarriageDao
{
    private static final Logger LOGGER = LoggerFactory.getLogger(MarriageDao.class);
    private EntityManager entityManager;
    @Value("${test.value}")
    private String test;
    public MarriageCertificate findMarriageCertificate(MarriageRequest marriageRequest){
        LOGGER.info("findMarriageCertificate called:{}", test);
        return null;
    }

}
