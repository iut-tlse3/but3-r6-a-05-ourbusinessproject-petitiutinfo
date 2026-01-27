package ourbusinessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Enterprise")
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @NotBlank
    @Column(name = "Name")
    private String Name;

    @Size(min = 10)
    @Column(name = "Description")
    private String Description;

    @NotBlank
    @Column(name = "ContactName")
    private String ContactName;

    @NotBlank @Email
    @Column(name = "ContactEmail")
    private String ContactEmail;

    /**
     *
     * @return the identifier
     */
    public Long getId() {
        return Id;
    }

    /**
     *
     * @return the name
     */
    public String getName() {
        return Name;
    }

    /**
     * Set the name
     * @param name the name
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     *
     * @return the description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * Set the description
     * @param description the description
     */
    public void setDescription(String description) {
        Description = description;
    }

    /**
     *
     * @return the contactName
     */
    public String getContactName() {
        return ContactName;
    }

    /**
     * Set the contactName
     * @param contactName the contactName
     */
    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    /**
     *
     * @return the contactEmail
     */
    public String getContactEmail() {
        return ContactEmail;
    }

    /**
     * Set the contactEmail
     * @param contactEmail the contactEmail
     */
    public void setContactEmail(String contactEmail) {
        ContactEmail = contactEmail;
    }
}
