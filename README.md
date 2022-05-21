# Using Teste in JAVA (Junit, tdd, Mockito)
![](https://img.shields.io/badge/Author-Alejandro_Fuentes_|_fuentesra@hotmail.com-informational?style=flat&logoColor=white&color=4a4c4d)

## Mockito


[Mockito][link-mockito] is framework for unit tests in java.
Your main functionality is creating a simulation the element util for test that don't need to change values in sensivel sources when we do test our funcionality.


### Some tips

* **final class**<br />
how to mock the class that have the propertie `final`, in file configuration of mockito
`resources\mockito-extensions\org.mockito.plugins.MockMaker` : 

```yaml
mock-maker-inline
```

* **primitive obsession**<br />
when we build a classes and set properties using type primitive, but [this site][link-about-primitiveObsession] talk about code smell when is it, and explanation for why is better using type objects. 


<!-- link and references -->
[link-mockito]: https://site.mockito.org/
[link-about-primitiveObsession]: https://blog.koalite.com/2017/09/primitive-obsession-obsession/