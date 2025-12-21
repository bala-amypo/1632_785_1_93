package com.example.demo.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name "interaction_check_results")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class InteractionCheckResult{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String medications;
    [INFO] 2 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  31.098 s
[INFO] Finished at: 2025-12-21T19:31:52Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (default-compile) on project demo: Compilation failure: Compilation failure: 
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/model/InteractionCheckResult.java:[14,12] ')' expected
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/model/InteractionCheckResult.java:[14,13] class, interface, enum, or record expected
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
coder@9227448ac6cb:~/Workspace/demo$ 
    private String interaction;
    private LocalDateTime checkedAt;

    public InteractionCheckResult(String medications,String interactions){
        this.medications=medications;
        this.interactions=interactions;
    }

    @PrePersist
    public void setCheckedAt(){
        this.CheckedAt =  LocalDateTime.now();
    }

}