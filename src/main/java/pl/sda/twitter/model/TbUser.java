package pl.sda.twitter.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_USER", catalog = "oKmX59cmbr")
public class TbUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "US_ID", unique = true, nullable = true)
    private Long id;
    @Column(name = "US_USERNAME", unique = true, nullable = true, length = 25)
    private String userName;
    @Column(name = "US_PASSWORD", nullable = true, length = 25)
    private String password;
}
