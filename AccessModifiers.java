/*
                                   Public      Private      Protected       Default

Same Class                          Yes          Yes          Yes            Yes

Same Package Subclass               Yes          No           Yes            Yes

Same Package Non-Subclass           Yes          No           Yes            Yes

Different Package Subclass          Yes          No           Yes             No

Different package Non-Subclass      Yes          No            No             No


       * Public means it can be accessed in anywhere.If you want something to be accessed outside the package,
         always make it Public.Variables should not be Public. But methods should be Public.

       * Private which can only be accessed in the same class.It can't even use outside the class.
         even if they're the same package, you can't access it.

       * Protected can be used in the same class,in the same package, in the other package, but subclass.
         If you make it protected, you can't use it outside the package,

       * Default means it can be accessed in the same package.Either make it private, public, protected or public.
         Don't keep it default. Default simply means you don't know what to give the access.

 */